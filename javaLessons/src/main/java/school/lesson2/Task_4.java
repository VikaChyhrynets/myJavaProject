package school.lesson2;

public class Task_4 {
    public static void main(String[] args) {
        printWordNTimes("Hello", 7);
    }

    public static void printWordNTimes(String word, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
}
