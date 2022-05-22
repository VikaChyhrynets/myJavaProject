package school.lesson2;

public class Task_2 {
    public static void main(String[] args) {
        isPositiveOrNegative(27);
    }


    public static void isPositiveOrNegative(int c) {
        if (c >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
