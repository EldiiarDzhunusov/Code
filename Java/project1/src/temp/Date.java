package temp;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day= day;
        this.month=month;
        this.year = year;
    }
    @Override
    public String toString() {
        String days;
        String months;
        String years;
        if(day<10){
            days = "0"+ Integer.toString(day);
        }
        else{
            days = Integer.toString(day);
        }
        if(month<10){
            months = "0"+ Integer.toString(month);
        }
        else{
            months = Integer.toString(month);
        }
        years = Integer.toString(year);

        return days+"/"+months+"/"+years;
    }

}
