package presenter;

import model.Toy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class LotteryManager {
    private PriorityQueue<Toy> prizeToys;

    public LotteryManager() {
        prizeToys = new PriorityQueue<>((t1, t2) -> Double.compare(t2.getSelection_weight(), t1.getSelection_weight()));
    }

    public void addPrizeToy(Toy toy) {
        prizeToys.add(toy);
    }

    public Toy getRandomPrizeToy() {
        if (prizeToys.isEmpty()) {
            return null; // Return null if no toys are available for the lottery
        }

        double totalWeight = 0;
        for (Toy toy : prizeToys) {
            totalWeight += toy.getSelection_weight();
        }

        Random rand = new Random();
        double randomWeight = rand.nextDouble() * totalWeight;

        Toy selectedToy = null;
        for (Toy toy : prizeToys) {
            randomWeight -= toy.getSelection_weight();
            if (randomWeight <= 0) {
                selectedToy = toy;
                break;
            }
        }

        if (selectedToy != null) {
            prizeToys.remove(selectedToy);
            selectedToy.setQuantity(selectedToy.getQuantity()-1);
        }

        return selectedToy;
    }

}
