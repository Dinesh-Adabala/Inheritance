package bank;

public class GooglePay extends MyBank {

    private int  pin=1221;
    private  String userName="gopi@java.com";

    public void googlePayTransfer(int screenLock,String userId){
        if(pin==screenLock && userName==userId){
            transfer();
        }else{
            String var =transferFailed();
            System.out.println(var);
        }
    }






}
