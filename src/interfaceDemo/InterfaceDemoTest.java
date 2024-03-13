package interfaceDemo;

public class InterfaceDemoTest {
    public static void main(String[] args) {
        RBIbankServices hdfcbankservice = new HDFCbankService();
        RBIbankServices sbibankservice = new SBIbankService();

      String hdfc=  hdfcbankservice.transfer("1234456","7654321",2000);
        String sbi= sbibankservice.transfer("1234567","76543321",9870);
        System.out.println(hdfc);
        System.out.println(sbi);
    }
}
