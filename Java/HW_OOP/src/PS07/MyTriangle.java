package PS07;

public class MyTriangle {
    private MyPoint_PS07 v1;
    private MyPoint_PS07 v2;
    private MyPoint_PS07 v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);
    }

    public MyTriangle(MyPoint_PS07 v1, MyPoint_PS07 v2, MyPoint_PS07 v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "PS07.MyTriangle[" +
                "v1=(" + v1.getX() +","+v1.getY() +
                "), v2=(" + v2.getX() +","+v2.getY() +
                "), v3=(" + v3.getX() +","+v3.getY() +
                ")]";
    }
    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }
    public String getType(){
        if(v1.distance(v2)==v2.distance(v3)&& v2.distance(v3)  ==v3.distance(v1)){
            return "equilateral";
        }
        else if(v1.distance(v2)!=v2.distance(v3)&& v1.distance(v2) !=v3.distance(v1) && v2.distance(v3)!= v3.distance(v1)){
            return "scalene";
        }
        else{
            return "isosceles";
        }
    }
}
