package PS07;

public class Invoice {
    private int ID;
    private CustomerOLD customerOLD;
    private double amount;

    public Invoice(int ID, CustomerOLD customerOLD, double amount) {
        this.ID = ID;
        this.customerOLD = customerOLD;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setCustomer(CustomerOLD customerOLD) {
        this.customerOLD = customerOLD;
    }

    public String getAmount() {
        return Double.toString(amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCustomerName(){
        return customerOLD.getName();
    }
    public double getAmountAfterDiscount(){
        return amount - (amount* customerOLD.getDiscount()/100.0);
    }
}
