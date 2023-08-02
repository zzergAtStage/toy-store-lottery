package presenter;

import model.ModuleStates;
import model.Toy;

import java.util.*;

public class ToyManager {
    private ArrayList<Toy> storageStock;

    public void setStorageStock(ArrayList<Toy> storageStock) {
        this.storageStock = storageStock;
    }

    private PriorityQueue<Toy> lotteryQueue;
    private FileStorage fileStorage;
    private ModuleStates status;

    public ToyManager() {
        this.status = ModuleStates.EMPTY;
    }

    public PriorityQueue<Toy> getLotteryQueue() {
        return lotteryQueue;
    }

    public ArrayList<Toy> getStorageStock() {
        return storageStock;
    }

    public void addToysToStock(Toy toy) {
        storageStock.add(toy);
    }

    public void removeToyFromStore(Toy toy) {
        if (toy != null) {
            boolean removed = storageStock.remove(toy.getId());
        }
    }

    public void updateToyWeight(String toyId, double newWeight) {
        for (Toy toy : storageStock) {
            if (Objects.equals(toy.getId(), toyId)) {
                toy.setSelection_weight(newWeight);
                break;
            }
        }
    }

    public boolean checkStatusLOADED() {
        return this.status == ModuleStates.LOADED;
    }

    public void setStatusLOADED() {
        if (!this.storageStock.isEmpty()) this.status = ModuleStates.LOADED;
    }

    public void showStorage() {
        for (Toy toy : this.storageStock
        ) {
            System.out.println(toy);
        }
    }

    public Toy getExistingToyFromStorage(String toyId) {
        Optional<Toy> toyOptional = this.storageStock.stream()
                .filter(toy -> Objects.equals(toy.getId(), toyId))
                .findFirst();
        return toyOptional.orElse(null); // Return null if the Toy with the given toyId is not found
    }
}
