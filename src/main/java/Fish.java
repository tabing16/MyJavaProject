package src.main.java;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, String size, double weight, int gills, int fins) {
        super(type, size, weight);
        this.gills = gills;
        this.fins = fins;
    }
}