public class Square_P02 extends Rectangle_P02 {
    private double side;

    public Square_P02() {
    }

    public Square_P02(double side) {
        this.side = side;
    }

    public Square_P02(double side, String color, boolean filled){
        this.side = side;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square["+super.toString()+"]";
    }
}
