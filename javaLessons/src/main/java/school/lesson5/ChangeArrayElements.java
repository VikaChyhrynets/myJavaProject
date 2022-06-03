package school.lesson5;

public class ChangeArrayElements {
    public String[] changeArrayElements(String[] a, int c, int d) {
        if (c < a.length && d < a.length && c >= 0 && d >= 0) {
            String f;
            f = a[c];
            a[c] = a[d];
            a[d] = f;
        } else {
            System.out.println("Check indexes");
        }
        return a;
    }
}

