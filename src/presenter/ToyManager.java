package presenter;

import model.Toy;
import json_model.Json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.lang.reflect.Type;

public class ToyManager {
    private HashMap<String, Toy> storageStock;

    private PriorityQueue<Toy> lotteryQueue;
    private FileStorage fileStorage;

    public ToyManager(HashMap<String, Toy> storageStock) {
        this.storageStock = storageStock;
    }

    public PriorityQueue<Toy> getLotteryQueue() {
        return lotteryQueue;
    }

    public HashMap<String, Toy> getStorageStock() {
        return storageStock;
    }

    public void addToysToStock(Toy toy) {
        storageStock.put(toy.getId(), toy);
    }

    public void removeToyFromStore(Toy toy) {
        if (toy != null) {
            Toy removed = storageStock.remove(toy.getId());
        }
   }
    public void updateToyWeight(String toyId, double newWeight) {
        for (Map.Entry<String,Toy> toy : storageStock.entrySet()) {
            if (Objects.equals(toy.getKey(), toyId)) {
                toy.getValue().setSelection_weight(newWeight);
                break;
            }
        }
    }


}