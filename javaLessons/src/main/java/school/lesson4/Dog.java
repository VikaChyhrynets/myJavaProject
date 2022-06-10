package school.lesson4;

public class Dog extends Animal {
    private static int countDog;
    private static final int MAX_RUN_LENGTH = 500;
    private static final int MAX_SWIM_LENGTH = 10;
    public Dog() {
        countDog++;
    }

    @Override
    public void run(int length) {
        if (length > MAX_RUN_LENGTH) {
            System.out.println("Dog can`t run for a distance of " + length + " m");
        } else {
            System.out.println("Dog ran " + length + " m");
        }
    }

    @Override
    public void swim(int length) {
        if (length > MAX_SWIM_LENGTH) {
            System.out.println("Dog can`t swim for a distance of " + length + " m");
        } else {
            System.out.println("Dog swam " + length + " m");
        }
    }

    public int getCountDog() {
        return countDog;
    }
}