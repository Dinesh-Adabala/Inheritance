package methodOverride;

public class GpayService extends BankAccountService {
    public boolean transfer(int fromMobileNo , int toMobileNo , int amount) {
        return super.transfer(fromMobileNo, toMobileNo, amount);
    }
}
