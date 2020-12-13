package HW;

public class MyDate {
    //not finished
    private int year;
    private int month;
    private int day;
    public static String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    public static String[] DAYS = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static int[] DAYS_IN_MONTHS ={31,28,31,30,31,30,31,31,30,31,30,31};
//feb month depends whether it is a leap year.

    public boolean isLeapYear(int year){
        return((year%4==0 && year%100!=0)|| year%400==0);
    }
    public boolean isValidDate(int year,int month, int day){
        boolean isYear = (year>=1&& year<=9999);
        boolean isMonth = (month>=1 && month<=12);
        boolean isDay;
        if(isLeapYear(year)){
            isDay=day>=1 && day<=29;
        }
        else{
            isDay = (day>=1 && day<= DAYS_IN_MONTHS[month-1]);
        }

        return (isYear&& isMonth && isDay);
    }
    public int getDayOfWeek(int year,int month, int day){
        //formula to find days of week 0-6
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        year -= (month < 3) ? 1 : 0;
        int ans= ( year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
        //ans= (ans+6)%7;
        return ans;
    }

    public MyDate(int year, int month, int day) {
        if(isValidDate(year,month,day)){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else{
            throw new IllegalArgumentException("Invalid year!");
        }

    }
    public void setDate(int year, int month, int day){
        if(isValidDate(year,month,day)){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else{
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<=1 && year<=9999){
            this.year = year;
        }
        else{
            throw new IllegalArgumentException("Invalid year!");
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<=1 && month<=12){
            this.month = month;
        }
        else{
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int dayMaxSupposed=0;
        if(isLeapYear(year)){
            if(month==2){
                dayMaxSupposed=29;
            }
            else{
                dayMaxSupposed= DAYS_IN_MONTHS[month-1];
            }
        }
        else{
            dayMaxSupposed= DAYS_IN_MONTHS[month-1];
        }
        if(day<=1 && day<=dayMaxSupposed){
            this.day = day;
        }
        else{
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    @Override
    public String toString() {

        String ans = String.format("%s %d %s %d",DAYS[getDayOfWeek(year,month,day)],day,MONTHS[month-1],year);
        return ans;
    }
    public MyDate nextDay() throws IllegalAccessException {
        int dayMaxSupposed=0;
        if(isLeapYear(year)){
            if(month==2){
                dayMaxSupposed=29;
            }
            else{
                dayMaxSupposed= DAYS_IN_MONTHS[month-1];
            }
        }
        else{
            dayMaxSupposed= DAYS_IN_MONTHS[month-1];
        }
        if(this.day==dayMaxSupposed && month==12 && year==9999){
            throw new IllegalAccessException("Invalid year!");
        }
        if(this.day<dayMaxSupposed){
            this.day++;
        }
        else{
            if(month<12){
                this.day=1;
                this.month++;
            }
            else{
                day=1;
                month=1;
                year++;
            }
        }
        return this;
    }
    public MyDate nextMonth() throws IllegalAccessException {

        if(month==12 && year==9999){
            throw new IllegalAccessException("Invalid year!");
        }
        else{
            if(month<12){
                month++;
            }
            else{
                month=1;
                year++;
            }
        }

        if((DAYS_IN_MONTHS[(month-1)])<=day){
            day=(DAYS_IN_MONTHS[(month-1)]);
        }

        return this;
    }
    public MyDate nextYear() throws IllegalAccessException {
        if(year==9999){
            throw new IllegalAccessException("Invalid year!");
        }
        else{
            year++;
        }
        if(isLeapYear(year)){
            if(29<day){
                day=29;
            }
        }
        else{
            if((DAYS_IN_MONTHS[(month-1)])<=day){
                day=(DAYS_IN_MONTHS[(month-1)]);
            }
        }
        return this;
    }
    public MyDate previousDay() throws IllegalAccessException {
        if(day<=1 && month<=1 && year<=1){
            throw new IllegalAccessException("Invalid year!");
        }
        else{
            if(day>1){
                day--;
            }
            else{
                if(month>1){
                    month--;
                    int dayMaxSupposed=0;
                    if(isLeapYear(year)){
                        if(month==2){
                            dayMaxSupposed=29;
                        }
                        else{
                            dayMaxSupposed= DAYS_IN_MONTHS[month-1];
                        }
                    }
                    else{
                        dayMaxSupposed= DAYS_IN_MONTHS[month-1];
                    }

                    day=dayMaxSupposed;
                }
                else{
                    year--;
                    month=12;
                    day=31;
                }
            }
        }
        return this;

    }
    public MyDate previousMonth() throws IllegalAccessException {
        if(month<=1 && year <=1){
            throw new IllegalAccessException("Invalid year!");
        }
        if(month<=1){
            month=12;
            year--;
        }
        else{
            month--;
        }
        if((DAYS_IN_MONTHS[(month-1)])<day);
        day= (DAYS_IN_MONTHS[(month-1)]);
        return this;
    }
    public MyDate previousYear() throws IllegalAccessException {
        if(year ==1){
            throw new IllegalAccessException("Invalid year!");
        }
        year--;
        if(isLeapYear(year)){
            if(29<day){
                day=29;
            }
        }
        else{
            if((DAYS_IN_MONTHS[(month-1)])<=day){
                day=(DAYS_IN_MONTHS[(month-1)]);
            }
        }

        return this;
    }

}
