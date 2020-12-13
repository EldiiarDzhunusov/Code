package PS07;

public class MyPoint_PS07 {
    private int x;
    private int y;

    public MyPoint_PS07(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint_PS07() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(MyPoint_PS07 another){
        return Math.sqrt(Math.pow(another.getX()-getX(),2)+Math.pow(another.getX()-getY(),2));

    }
}
