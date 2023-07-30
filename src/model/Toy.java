package model;

public class Toy {
    private final String id;

    private final String name;

    private double selection_weight;

    private int quantity;

    public Toy(String id, String name, int quantity, double selection_weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.selection_weight = selection_weight;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setSelection_weight(double selection_weight) {
        this.selection_weight = selection_weight;
    }

    public double getSelection_weight() {
        return selection_weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Toy {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", the rest (quantity) = " + quantity +
                ", selection_weight=" + selection_weight +
                '}';
    }
}
