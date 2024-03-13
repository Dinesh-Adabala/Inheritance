public class RetailAccount extends Insurance {
    public int minimumBalance=100;
    public int limit=20;

    public RetailAccount(String accountNumber, int balance, boolean status) {
        super(accountNumber, balance, status);
    }
}
