public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(int hour, int minute, int second) {
        if(hour>=60 || minute >=60 || second >=60){
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public MyTime() {

    }
    public void setTime(int hour, int minutes, int seconds){
        if(hour>=60 || minutes >=60 || seconds>=60){
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        else{
            this.hour = hour;
            this.minute = minutes;
            this.second = seconds;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour<60){
            this.hour = hour;
        }
        else{
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute <60){
            this.minute = minute;
        }
        else{
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second <60){
            this.second = second;
        }
        else{
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }
    @Override
    public String toString() {
        String hours;
        String minutes1;
        String seconds1;
        if(hour<10){
            hours = "0"+ Integer.toString(hour);
        }
        else{
            hours = Integer.toString(hour);
        }
        if(minute <10){
            minutes1 = "0"+ Integer.toString(minute);
        }
        else{
            minutes1 = Integer.toString(minute);
        }
        if(second <10){
            seconds1 = "0"+ Integer.toString(second);
        }
        else{
            seconds1 = Integer.toString(second);
        }

        return hours+":"+ minute +":"+seconds1;
    }
    public MyTime nextSecond(){
        MyTime mytime = new MyTime(hour, minute, second);
        if(second <58){
            mytime.second +=1;
        }
        else{
            mytime.second =0;
            if(mytime.minute <58){
                mytime.minute +=1;
            }
            else{
                mytime.minute =0;
                if(mytime.hour<22){
                    mytime.hour +=1;
                }
                else{
                    mytime.hour=0;
                }
            }
        }
        return mytime;
    }
    public MyTime nextMinute(){
        MyTime mytime = new MyTime(hour, minute, second);

            if(mytime.minute <58){
                mytime.minute +=1;
            }
            else{
                mytime.minute =0;
                if(mytime.hour<22){
                    mytime.hour +=1;
                }
                else{
                    mytime.hour=0;
                }
        }
        return mytime;
    }
    public MyTime nextHour(){
        MyTime mytime = new MyTime(hour, minute, second);

            if(mytime.hour<22){
                mytime.hour +=1;
            }
            else{
                mytime.hour=0;
            }

        return mytime;
    }
    public MyTime previousSecond(){
        MyTime mytime = new MyTime(hour, minute, second);
        if(second !=0){
            mytime.second -=1;
        }
        else{
            mytime.second =0;
            if(mytime.minute !=0){
                mytime.minute -=1;
            }
            else{
                mytime.minute =0;
                if(mytime.hour!=0){
                    mytime.hour -=1;
                }
                else{
                    mytime.hour=0;
                }
            }
        }
        return mytime;
    }
    public MyTime previousMinute(){
        MyTime mytime = new MyTime(hour, minute, second);

        if(mytime.minute !=0){
            mytime.minute -=1;
        }
        else{
            mytime.minute =0;
            if(mytime.hour!=0){
                mytime.hour -=1;
            }
            else{
                mytime.hour=0;
            }
        }
        return mytime;
    }
    public MyTime previousHour(){
        MyTime mytime = new MyTime(hour, minute, second);

        if(mytime.hour!=0){
            mytime.hour -=1;
        }
        else{
            mytime.hour=0;
        }

        return mytime;
    }

}
