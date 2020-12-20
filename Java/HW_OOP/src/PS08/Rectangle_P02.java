package PS08;

public class Rectangle_P02 extends Shape_OLD {
    private double width =1.0;
    private double length = 1.0;

    public Rectangle_P02() {
    }

    public Rectangle_P02(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle_P02(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return 2*length*2*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString()+
                ",width=" + width +
                ",length=" + length +
                ']';
    }
}
