package school.lesson4;

public class Cat2 {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            System.out.println(name + " can`t eat, not enough food in the plate");
        } else {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }
}

