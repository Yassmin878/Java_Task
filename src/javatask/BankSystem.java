
package javatask;

public class BankSystem {
     Customer c;

    public BankSystem(Customer c) {
        this.c = c;
    }
    
    public String Deposit(double amount){
        if( amount<5000&&amount>=100)
        {    c.setAccountBalance(c.getAccountBalance()+amount);
            return "Successfully Done";
        }    
        else
             return "Try again";         
    }
     public String Withdrawal(double amount){
        if( c.getAccountBalance()>=amount&& amount<=8000&&amount>=50)
        {  
            c.setAccountBalance(c.getAccountBalance()-amount);
            return "Your Balance now is "+c.getAccountBalance() ;
        }
        else
             return "Failed" ;         
    }
      public String Balance_inquiry(){
          return c.toString();
      }
    
}
    

