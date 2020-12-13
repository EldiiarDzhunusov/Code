package Done;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y,int width, int height) {
        this.x1 = x;
        this.y1= y;
        x2=x1+width-1;
        y2=y1+height-1;
    }
    public int getX(){
        return x1;
    }
    public int getY(){
        return y1;
    }
    public int getWidth(){
        return x2-x1+1;
    }
    public int getHeight(){
        return y1-y1+1;
    }
    public boolean collides(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 ||
                ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            ball.reflectVertical();
            return true;
        }
       return false;
    }

    @Override
    public String toString() {
        return "Done.Container[" +
                "(" + x1 +
                "," + y1 +
                "),(" + x2 +
                "," + y2 +
                ")]";
    }
}
