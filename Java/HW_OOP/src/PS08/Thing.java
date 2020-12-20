package PS08;

import java.util.Objects;

public class Thing {
    private String name;
    private double weight;

    public Thing(String name, double weight) {
        this.name = name;
        if (weight<0){
            throw new IllegalArgumentException();
        }
        this.weight = weight;
    }

  //need to implement equals and hashcode

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
