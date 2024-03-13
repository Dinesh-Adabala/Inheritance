package methodOverride;

public class BankAccountService {
    int fromAccBlnc = 1000;
    int toAccBlnc = 0;
    String fromAccount = null;
    String toAccount = null;
   /* public boolean login(String userName , String password){
        return true;
    }*/

    public boolean transfer(int fromMobileNo , int toMobileNo , int amount){
        System.out.println("From super class Bank account service");
       if (fromMobileNo==12345){
           fromAccount = "111";
           return  this.booktransfer(fromAccount,toAccount,amount);
       }else {
           return false;
       }
      /* if (toMobileNo==45678){
           toAccount = "222";
           return  this.booktransfer(fromAccount,toAccount,amount);

       }else {
           return false;*/
       //}
        //return  this.booktransfer(fromAccount,toAccount,amount);
    }
    public boolean booktransfer(String fromAccount , String toAccount , int amount){
        toAccBlnc = toAccBlnc +amount;
        fromAccBlnc = fromAccBlnc - amount;
        return true;
    }
}
