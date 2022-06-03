package school.lesson5;

import java.util.ArrayList;

public class MainTask2 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();


        Box<Apple> appleBox1 = new Box<Apple>();
        Box<Orange> orangeBox1 = new Box<Orange>();
        Box<Apple> appleBox2 = new Box<Apple>();

        appleBox1.addToList(apple1);
        appleBox1.addToList(apple2);
        appleBox1.addToList(apple3);
        appleBox1.addToList(apple4);

        orangeBox1.addToList(orange1);
        orangeBox1.addToList(orange2);
        orangeBox1.addToList(orange3);
        orangeBox1.addToList(orange4);
        orangeBox1.addToList(orange5);
        orangeBox1.addToList(orange6);

        appleBox2.addToList(apple5);
        appleBox2.addToList(apple6);

        System.out.println("");
        System.out.println("Here is the box of apples: ");
        for (int i = 0; i < appleBox1.getList().size(); i++) {
            System.out.println(appleBox1.getList().get(i));
        }

        System.out.println("");
        System.out.println("Here is the box of oranges: ");
        for (int i = 0; i < orangeBox1.getList().size(); i++) {
            System.out.println(orangeBox1.getList().get(i));
        }

        System.out.println("");
        System.out.println("box " + appleBox1 + " weight: " + appleBox1.getBoxWeight());
        System.out.println("box " + orangeBox1 + " weight: " + orangeBox1.getBoxWeight());

        System.out.println("");
        System.out.println("compare result: " + appleBox1.compare(orangeBox1));

        System.out.println("");
        System.out.println("AppleBox1 contains: ");
        for (int i = 0; i < appleBox1.getList().size(); i++) {
            System.out.println(appleBox1.getList().get(i));
        }

        System.out.println("");
        System.out.println("AppleBox2 contains: ");
        for (int i = 0; i < appleBox2.getList().size(); i++) {
            System.out.println(appleBox2.getList().get(i));
        }

        System.out.println("");
        System.out.println("Moving apples from box1 to box2....");
        appleBox1.moveFruits(appleBox2);

        System.out.println("");
        System.out.println("AppleBox1 contains: ");
        for (int i = 0; i < appleBox1.getList().size(); i++) {
            System.out.println(appleBox1.getList().get(i));
        }

        System.out.println("");
        System.out.println("AppleBox2 contains: ");
        for (int i = 0; i < appleBox2.getList().size(); i++) {
            System.out.println(appleBox2.getList().get(i));
        }

    }
}
