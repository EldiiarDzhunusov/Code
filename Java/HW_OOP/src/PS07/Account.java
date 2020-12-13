package PS07;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>=0){
            this.balance = balance;
        }
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        if(balance>=0){
            balance+=amount;
        }

        return this;
    }
    public Account withdraw(double amount){
        if(balance-amount>=0){
            balance-=amount;
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s(%d) balance=$%0.2f",customer.getName(),customer.getID(),balance);

    }
}
