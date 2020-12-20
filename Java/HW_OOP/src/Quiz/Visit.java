package Quiz;

import java.util.Date;
import java.util.HashMap;

public class Visit {

    private CustomerFinal customerFinal;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(CustomerFinal customerFinal, Date date) {
        this.customerFinal = customerFinal;
        this.date=date;
    }

    public String getName() {
        return customerFinal.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = this.productExpense + productExpense;
    }

    public double getTotalExpense() {
        return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customerFinal.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customerFinal.getMemberType())));

    }

    @Override
    public String toString() {
        String word= date.toString();
        String day = word.substring(8,10);
        String year = word.substring((word.length()-4),word.length());
        HashMap<String, String> list= new HashMap<>();
        list.put("Jan","01");
        list.put("Feb","02");
        list.put("Mar","03");
        list.put("Apr","04");
        list.put("May","05");
        list.put("Jun","06");
        list.put("Jul","07");
        list.put("Aug","08");
        list.put("Sep","09");
        list.put("Oct","10");
        list.put("Nov","11");
        list.put("Dec","12");
        String month = list.get(word.substring(4,7));
        String ans = String.format("%s-%s-%s",day,month,year);
//        date.getDay()+"-"+date.getMonth()+"-"+date.getYear()
        String temp1 = String.format("%.2f",serviceExpense);
        String temp2 = String.format("%.2f",productExpense);
        return "Quiz.Visit{" +
                "customer=" + customerFinal.toString() +
                ", date=" + ans+
                ", serviceExpense=" + temp1 +
                ", productExpense=" + temp2 +
                '}';
    }
}