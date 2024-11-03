package payment;

public interface UPIPayment {

    Payment transfer(String fromMobileNumber,String toMobileNumber,Double amount);
}
