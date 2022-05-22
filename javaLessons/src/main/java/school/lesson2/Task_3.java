package school.lesson2;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println(isTrueOrFalse(-100));

    }

    public static boolean isTrueOrFalse(int v) {
        if (v >= 0) {
            return false;
        } else {
            return true;
        }
    }
}

