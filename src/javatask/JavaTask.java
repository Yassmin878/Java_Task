package javatask;

public class JavaTask {

    public static void main(String[] args) {
       Customer c1 =new Customer("Yassmin", 9000, "022546265");
       Customer c2 =new Customer("Ahmed",5000, "0606265");
       BankSystem B1= new BankSystem(c2);
       Interest I1= new Interest(c1);
       
        System.out.println(B1.Deposit(180));
        System.out.println(B1.Withdrawal(100));
        System.out.println(B1.Balance_inquiry());
        I1.interest_calc();
        System.out.println(c1.getAccountBalance()); 
    }
    
}
