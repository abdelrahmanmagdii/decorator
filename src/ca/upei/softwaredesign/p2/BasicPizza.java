package ca.upei.softwaredesign.p2;

public abstract class BasicPizza {
    String description = "";

    public String getDescription() {
        return description;
    }
    public abstract double cost();

}
