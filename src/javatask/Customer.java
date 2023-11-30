package javatask;

public class Customer {
    private String name;
    private double accountBalance;
    private String phoneNumber;

    public Customer(String name, double accountBalance, String phoneNumber) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", accountBalance=" + accountBalance + ", phoneNumber=" + phoneNumber + '}';
    }
    
}
