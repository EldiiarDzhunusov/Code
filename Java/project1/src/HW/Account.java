package HW;

public class Account {
    private int accountNumber;
    private double balance = 0.0;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount){
        balance+=amount;
    }
    public void debit(double amount){
        if(balance - amount<0){
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        else{
            balance-=amount;
        }

    }
    public void print(){
        System.out.printf("A/C no: %d Balance=$%0.2lf",accountNumber,balance);
    }

    @Override
    public String toString() {
        String s = String.format("A/C no: %d Balance=$%0.2lf",accountNumber,balance);
        return s;
    }
}
