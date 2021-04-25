package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;
    private boolean hasMemoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return hasMemoryLoss;
    }

    public void setHasMemoryLoss(boolean hasMemoryLoss) {
        this.hasMemoryLoss = hasMemoryLoss;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String status() {
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + hasMemoryLoss;
    }

    abstract void feed();
}
