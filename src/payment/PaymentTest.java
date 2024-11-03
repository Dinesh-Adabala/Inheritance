package payment;

public class PaymentTest {
    public static void main(String[] args) {
        UPIPayment payment = new PhonePay();
       Payment pay = payment.transfer("7672095126","9000308335",100.0);
        Payment pay1 = payment.transfer("7672095126","9000308335",100.0);
        Payment pay2 = payment.transfer("7672095126","9000308335",100.0);
        Payment pay3 = payment.transfer("7672095126","9000308335",100.0);
        System.out.println("Statuds" + pay3.getStatus());
        System.out.println("Balance of from account "+ PhonePay.accountBalanceMap.get("9000308335"));
        System.out.println("Balance of to account "+ PhonePay.accountBalanceMap.get("7672095126"));
    }
}
