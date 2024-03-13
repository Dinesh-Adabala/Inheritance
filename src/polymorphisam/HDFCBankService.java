package polymorphisam;

public class HDFCBankService extends RBIBankService {
    public double calculateIntrest(int principalAmount){
        double intrestAmt = super.calculateIntrest(principalAmount);
        double totalAmt = intrestAmt*principalAmount;
        return totalAmt;
    }
    public double calculateIntrest(int principalAmount,int days){
        double totalAmt=0;
        if (days>90){
            return this.calculateIntrest(principalAmount);

        }
        return  totalAmt + principalAmount;
    }

}
