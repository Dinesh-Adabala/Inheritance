package payment;

import java.util.*;
import java.util.function.BiPredicate;

public class PhonePay implements UPIPayment{
    static int transferLimt ;
    static Map<String, List<Payment>> accountLimtMap = new HashMap<>();
   static Map<String,Double> accountBalanceMap = new HashMap<>();
    static {
        accountBalanceMap.put("7672095126",1000.0);
        accountBalanceMap.put("9000308335",500.0);
    }

    BiPredicate<String,Double> balanceCheck = (accountNumber,atm) ->{
        Double accountBalance = accountBalanceMap.get(accountNumber);
        if (accountBalance > atm){
            return true;
        }else {
            return false;
        }
    };



    @Override
    public Payment transfer(String fromMobileNumber, String toMobileNumber, Double amount) {
        Payment p = new Payment();
        if (transferLimt < 3) {
            if (balanceCheck.test(fromMobileNumber, amount)) {
                Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
                Double toAccountBalance = accountBalanceMap.get(toMobileNumber);
                Double fromTotalBalnce = fromAccountBalance - amount;
                Double toTotalBalnce = toAccountBalance + amount;
                accountBalanceMap.put(fromMobileNumber, fromTotalBalnce);
                accountBalanceMap.put(toMobileNumber, toTotalBalnce);

                p.setStatus(Status.SUCCESS.getKey());
                p.settID(UUID.randomUUID().toString());
                p.settDate(new Date());
                p.setUser(UUID.randomUUID().toString());

                this.transferLimt=transferLimt+1;
                System.out.println(p.getStatus());
                System.out.println("Payment completed"+transferLimt);

            } else {
                p.setStatus(Status.FAILDE.getKey());
                p.settID(UUID.randomUUID().toString());
                p.settDate(new Date());
                p.setUser(UUID.randomUUID().toString());
            }
        }else {
            System.out.println("Daily limit was completed"+transferLimt);

            p.setStatus(Status.FAILDE.getKey());
            p.settID(UUID.randomUUID().toString());
            p.settDate(new Date());
            p.setUser(UUID.randomUUID().toString());
        }
            return p;

    }
}
