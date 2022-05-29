package school.lesson4;

public class MainTask2 {
    public static void main(String[] args) {
        Cat2[] cats = new Cat2[3];
        cats[0] = new Cat2("Barsik", 10);
        cats[1] = new Cat2("Funtik", 20);
        cats[2] = new Cat2("Bonya", 15);
        Plate plate = new Plate(40);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].getName() + "'s satiety is " + cats[i].getSatiety());
        }
        plate.addFood(5);
        plate.info();
        cats[2].eat(plate);
        System.out.println(cats[2].getName() + "'s satiety is " + cats[2].getSatiety());
    }
}
