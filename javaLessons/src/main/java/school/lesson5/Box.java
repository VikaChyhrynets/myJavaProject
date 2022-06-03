package school.lesson5;

import java.util.ArrayList;

public class Box<Fruit> {

    private Fruit obj;
    private double boxWeight;
    private ArrayList<Fruit> list = new ArrayList<Fruit>();

    public void addToList(Fruit obj) {
        this.obj = obj;
        list.add(obj);
    }

    public ArrayList<Fruit> getList() {
        return list;
    }

    public double getBoxWeight() {
        double weight = 0;
        if (obj instanceof Apple) {
            weight = list.size() * ((Apple) obj).getWeight();
        } else if (obj instanceof Orange) {
            weight = list.size() * ((Orange) obj).getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        boolean comp = false;
        if (this.getBoxWeight() == box.getBoxWeight()) {
            comp = true;
        } else {
            comp = false;
        }
        return comp;
    }

    public void moveFruits(Box<Fruit> box) {
        for (int i = 0; i < this.list.size(); i++) {
            box.addToList(this.list.get(i));
        }
        this.list.clear();
    }
}
