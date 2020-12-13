package Done;

public class Time {
    public int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public Time() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public void SetTime(int hour, int minute, int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        String hours;
        String minutes;
        String seconds1;
        if(hour<10){
            hours = "0"+ Integer.toString(hour);
        }
        else{
            hours = Integer.toString(hour);
        }
        if(minute<10){
            minutes = "0"+ Integer.toString(minute);
        }
        else{
            minutes = Integer.toString(minute);
        }
        if(seconds<10){
            seconds1 = "0"+ Integer.toString(seconds);
        }
        else{
            seconds1 = Integer.toString(seconds);
        }

        return hours+":"+minutes+":"+seconds1;
    }
    public Time nextSecond(){
        Time time = new Time(hour,minute,seconds);
        time.seconds+=1;
        return time;
    }
    public Time previousSecond(){
        Time time = new Time(hour,minute,seconds);
        time.seconds-=1;
        return time;
    }
}
