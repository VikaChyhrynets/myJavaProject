package school.lesson4;

public class MainTask1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.run(100);
        cat2.run(250);
        cat2.swim(100);
        dog1.run(500);
        dog2.run(700);
        dog1.swim(5);
        dog2.swim(15);

        System.out.println("Dogs count: " + dog1.getCountDog());
        System.out.println("Cats count: " + cat1.getCountCat());
        System.out.println("Animals count: " + cat1.getCountAnimals());

    }
}
