package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        fishList.add(fish);
    }

    public void feed() {
        for (Fish fish: fishList) {
            fish.feed();
        }
    }

    public void removeFish() {
        Iterator<Fish> i = fishList.iterator();
        while (i.hasNext()) {
            Fish fish = i.next();
            if (fish.getWeight() >= 11) {
                i.remove();
            }
        }
    }

    public List<String> getStatus() {
        List<String> statusList = new ArrayList<>();
        for (Fish fish: fishList) {
            statusList.add(fish.status());
        }
        return statusList;
    }
}
