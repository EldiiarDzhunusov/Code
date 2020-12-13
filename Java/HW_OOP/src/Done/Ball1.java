package Done;

public class Ball1 {
    private float y;
    private float x;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball1(float x, float y, int radius, int speed, int direction) {
        this.y = y;
        this.x = x;
        this.radius = radius;
        this.xDelta = (float)(speed * Math.cos(direction));
        this.yDelta = (float)(-speed * Math.sin(direction));
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
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
        x+= xDelta;
        y+= yDelta;
    }
    public void reflectHorizontal(){
        xDelta = -xDelta;
    }
    public void reflectVertical(){
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        String s = String.format("Done.Ball[(%f,%f),speed=(%f,%f)]",x,y,xDelta,yDelta);
        return s;
    }
}
