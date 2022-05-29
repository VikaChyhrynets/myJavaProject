package school.lesson4;

public abstract class Animal {
    private static int countAnimals;

    public Animal() {
        countAnimals++;
    }

    public void run(int length) {
        System.out.println("Animal ran " + length + " m");
    }

    public void swim(int length) {
        System.out.println("Animal swam " + length + " m");
    }

    public int getCountAnimals() {
        return countAnimals;
    }
}
