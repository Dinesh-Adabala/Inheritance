package methodOverride;

public class MethhodOverrideTest {
    public static void main(String[] args) {
        PhonePayService phonePayService = new PhonePayService();
        phonePayService.transfer(12345, 45678, 100);
        phonePayService.transfer(12345, 45678, 100);
        phonePayService.transfer(12345, 45678, 100);
        System.out.println(phonePayService.toAccBlnc);
        BankAccountService bankAccountService = new BankAccountService();
        bankAccountService.transfer(12345,45678,100);
    }
}