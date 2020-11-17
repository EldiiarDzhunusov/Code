package temp;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public static String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    public static String[] DAYS = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static int[] DAYS_IN_MONTHS ={31,28,31,30,31,30,31,31,30,31,30,31};
    public boolean isLeapYear(int year){
        return((year%4==0 && year%100!=0)|| year%400==0);
    }
    public boolean isValidDate(int year,int month, int day){
        boolean isyear = (year>=1&& year<=9999);
        boolean ismonth = month>=1 && month<=12;
        boolean isday = (day == DAYS_IN_MONTHS[month-1]);
        return (isyear&& ismonth && isday);
    }
//    public int getDayOfWeek(int year,int month, int day){
//
//    }

}
