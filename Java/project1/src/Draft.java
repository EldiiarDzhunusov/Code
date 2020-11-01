
import HW.Customer;

public class Draft {
    public static void main(String[] args) {
        Customer customer = new Customer("Nurlan", "Shaidullaev", "Shaidullaev" , "Shaidullaev", 14,  "Shaidullaev");
        customer.setPassword(customer.generatePassword());
        System.out.println(customer.toString());
    }

}
