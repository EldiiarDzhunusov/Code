package PS09;

public class Darts {
    private double x;
    private double y;
    private double length;

    public Darts(double x, double y) {
        this.x = x;
        this.y = y;
        length = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public int score(){
        if(length<=10 && length>5){
            return 1;
        }
        else if(length<=5 && length>1){
            return 5;
        }
        else if(length<=1 && length>=0){
            return 10;
        }
        else{
            return 0;
        }

    }
}
