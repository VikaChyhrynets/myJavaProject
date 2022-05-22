package school.lesson2;

public class Task_4add {
    public static void main(String[] args) {
        System.out.println(leapYear(1804));
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && (year % 100 > 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}


