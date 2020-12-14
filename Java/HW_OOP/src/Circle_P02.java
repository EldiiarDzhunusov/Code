public class Circle_P02 extends Shape_OLD {
    private double radius = 1.0;

    public Circle_P02() {
    }

    public Circle_P02(double radius) {
        this.radius = radius;
    }

    public Circle_P02(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                ",radius=" + radius +
                ']';
    }
}
