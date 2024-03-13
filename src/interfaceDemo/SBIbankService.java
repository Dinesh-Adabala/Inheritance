package interfaceDemo;

public class SBIbankService implements RBIbankServices {

    @Override
    public String transfer(String forAccountNo, String toAccountNo, int amt) {
        return "Transfer from SBI Bank";
    }
}
