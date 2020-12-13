package Done;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
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
    public int[] getXY(){
        int[] arr ={x,y};
        return arr;
    }
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public double distance(int x, int y ){
        int x1 = Math.abs(this.x - x);
        int y1 = Math.abs(this.y-y);
        double ans = Math.sqrt(x1*x1+y1*y1);
        return ans;
    }
    public double distance(MyPoint another){
        int x2 = another.getX();
        int y2 = another.getY();
        int x1 = Math.abs(this.x - x2);
        int y1 = Math.abs(this.y-y2);
        double ans = Math.sqrt(x1*x1+y1*y1);
        return ans;
    }
    public double distance(){
        double ans = Math.sqrt(x*x+y*y);
        return ans;
    }
}
