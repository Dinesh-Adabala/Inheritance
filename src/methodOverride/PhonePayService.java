package methodOverride;

public class PhonePayService extends BankAccountService {
    public boolean transfer(int fromMobileNo , int toMobileNo , int amount) {
        System.out.println("From sub class PhonePayService");
    return super.transfer(fromMobileNo,toMobileNo,amount);
    }


}
