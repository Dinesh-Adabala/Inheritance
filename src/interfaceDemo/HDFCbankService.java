package interfaceDemo;

public class HDFCbankService implements RBIbankServices{
    @Override
    public String transfer(String forAccountNo, String toAccountNo, int amt) {
        return "Transfer fron HDFC Bank";
    }
}
