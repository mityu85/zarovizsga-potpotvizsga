package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends Fish {

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        setHasMemoryLoss(true);
    }

    @Override
    void feed() {
        setWeight(getWeight()+1);
    }
}
