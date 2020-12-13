package Done;

public class Ball_PS07_07 {
    private float x;
    private float y;
    private float z;

    public Ball_PS07_07(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    @Override
    public String toString() {
        return String.format("(%0.1f,%0.1f,0,1f)",x,y,z);
    }
}
