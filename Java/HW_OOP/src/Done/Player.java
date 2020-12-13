package Done;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z=0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
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

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void move(float xDisp, float yDisp){
        this.x+=xDisp;
        this.y+=yDisp;

    }
    public void jump(float zDisp){
        this.z+=zDisp;

    }
    public Boolean near(Ball_PS07_07 ballPS0707){
        double distance = Math.sqrt(Math.pow((this.x- ballPS0707.getX()),2) + Math.pow(this.y- ballPS0707.getY(),2) + Math.pow(this.z- ballPS0707.getZ(),2));
        return (distance<8);

    }
    public void kick(Ball_PS07_07 ballPS0707){
        ballPS0707.setXYZ(ballPS0707.getX()+1, ballPS0707.getY()+1, ballPS0707.getZ()+1);
        System.out.println(ballPS0707.toString());
    }
}
