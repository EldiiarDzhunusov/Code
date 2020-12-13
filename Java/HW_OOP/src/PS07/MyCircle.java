package PS07;

public class MyCircle {
    private MyPoint_PS07 center = new MyPoint_PS07(0,0);
    private int radius = 1;

    public MyCircle(){
    }

    public MyCircle(int x,int y, int radius) {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }

    public MyCircle(MyPoint_PS07 center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint_PS07 getCenter() {
        return center;
    }

    public void setCenter(MyPoint_PS07 center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return new int[]{center.getX(), center.getY()};
    }
    public void setCenterXY(int x, int y){
        center.setX(x);
        center.setY(y);
    }

    @Override
    public String toString() {
        return "PS07.MyCircle[radius="+"r"+",center=("+"x"+","+"y"+")]";
    }
    public double getArea(){
        return Math.pow(Math.PI*radius,2);
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle another){
        return center.distance(another.getCenter());
    }
}
