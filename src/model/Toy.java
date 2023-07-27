package model;

public class Toy {
    private final int id;

    private final String name;

    private final double selection_weight;

    public Toy(int id, String name, double selection_weight) {
        this.id = id;
        this.name = name;
        this.selection_weight = selection_weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSelection_weight() {
        return selection_weight;
    }

    @Override
    public String toString() {
        return "Toy {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", selection_weight=" + selection_weight +
                '}';
    }
}
