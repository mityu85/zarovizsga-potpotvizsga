package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends Fish{

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    void feed() {
        setWeight(getWeight()+2);
    }
}
