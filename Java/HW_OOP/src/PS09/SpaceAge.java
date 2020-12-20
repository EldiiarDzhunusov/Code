package PS09;

import java.math.BigInteger;

public class SpaceAge {
    private  long seconds;
    private double earthYear;

    public SpaceAge(long seconds) {
        this.seconds = seconds;
        earthYear = seconds/31557600.0;
    }
    public double onEarth(){
        return earthYear;
    }
    public double onMercury(){
        return earthYear/0.2408467;
    }
    public double onVenus(){
        return earthYear/0.61519726;
    }
    public double onMars(){
        return earthYear/1.8808158;
    }
    public double onJupiter(){
        return earthYear/11.862615;
    }
    public double onSaturn(){
        return earthYear/29.447498;
    }
    public double onUranus(){
        return earthYear/84.016846;
    }
    public double onNeptune(){
        return earthYear/164.79132;
    }


}
