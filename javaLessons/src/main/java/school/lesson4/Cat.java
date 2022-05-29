package school.lesson4;

public class Cat extends Animal {
    private static int countCat;
    private static final int MAX_RUN_LENGTH = 200;

    public Cat() {
        countCat++;
    }

    @Override
    public void run(int length) {
        if (length > MAX_RUN_LENGTH) {
            System.out.println("Cat can`t run for a distance of " + length);
        } else {
            System.out.println("Cat ran " + length + " m");
        }
    }


    @Override
    public void swim(int length) {
        System.out.println("Cat can`t swim");
    }
    public int getCountCat() {
        return countCat;
    }
}
