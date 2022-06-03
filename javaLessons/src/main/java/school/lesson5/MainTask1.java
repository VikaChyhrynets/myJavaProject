package school.lesson5;

public class MainTask1 {
    public static void main(String[] args) {
        String[] a = {"Apple", "Orange", "Banana"};
        ChangeArrayElements changeArrayElements = new ChangeArrayElements();
        changeArrayElements.changeArrayElements(a, 0, 2);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
