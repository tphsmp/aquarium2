package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    List<Fish> fishes = new ArrayList<Fish>();

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void removeFish(Fish fish) {
        fishes.remove(fish);
    }

    public void changeFish(Fish fish, String newFish) {
        fishes.set(fishes.indexOf(fish), fish);
    }

    public void printAll() {
        for (Fish fish : fishes) {
            System.out.println(fish);
        }
    }
}
