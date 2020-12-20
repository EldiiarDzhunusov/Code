package PS08;

public class Shape_OLD {
    private String color = "red";
    private boolean filled =true;

    public Shape_OLD() {
    }

    public Shape_OLD(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color=" + color +
                ",filled=" + filled +
                ']';
    }
}
