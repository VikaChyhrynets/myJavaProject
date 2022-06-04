package school.lesson5;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private T obj;
    private double boxWeight;
    private ArrayList<T> list = new ArrayList<T>();

    public void addToList(T obj) {
        this.obj = obj;
        list.add(obj);
    }

    public ArrayList<T> getList() {
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

    public void moveFruits(Box<T> box) {
        for (int i = 0; i < this.list.size(); i++) {
            box.addToList(this.list.get(i));
        }
        this.list.clear();
    }
}
