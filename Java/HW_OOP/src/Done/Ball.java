package Done;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius,int speed,int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float)(speed * Math.cos(direction));
        this.xDelta = (float)(((-1)*speed) * Math.sin(direction));
        //speed and direction
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        y+=yDelta;
        x+=xDelta;
    }
    public void reflectHorizontal(){
        xDelta=(-1)*xDelta;
    }
    public void reflectVertical(){
        yDelta= (-1)*yDelta;
    }

    @Override
    public String toString() {
        return String.format("Done.Ball[(%f,%f),speed=(%f,%f)]",x,y,xDelta,yDelta);
    }
}
