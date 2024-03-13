package polymorphisam;

public class BankServiceTest {
    public static void main(String[] args) {
        SBIBankService sbiBankService = new SBIBankService();
        sbiBankService.calculateIntrest(1000);
       double sbiBankIntrest = sbiBankService.calculateIntrest(1000,86);
        System.out.println(sbiBankIntrest);

        HDFCBankService hdfcBankService = new HDFCBankService();
        double hdfcBankIntrest = hdfcBankService.calculateIntrest(1000,91);
        System.out.println(hdfcBankIntrest);
    }
}
