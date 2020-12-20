package PS08;

public class Square extends Rectangle{
    double side;
    public Square() {

    }
    public Square(double side) {
        this.side= side;
    }

    public Square( double side, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.side =side;
    }
    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +
                ",side=" + side +
                ']';
    }
}
