package school.lesson6;

public class MainApp {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] correctArr1 = new String[][] {
                {"2", "6", "8", "8"},
                {"4", "5", "6", "4"},
                {"6", "5", "9", "2"},
                {"8", "5", "7", "9"}
        };
        String[][] wrongArray1 = new String[][] {
                {"4", "8", "9", "4"},
                {"1", "k", "3", "4"},
                {"1", "7", "0", "6"},
                {"1", "2", "4", "8"}
        };
        String[][] wrongArray2 = new String[][] {
                {"8", "8", "3"},
                {"1", "4", "3"},
                {"1", "2", "3"},
                {"5", "4", "8"}
        };
        ArrayOperations arrayOperations = new ArrayOperations();

        try {
            System.out.println(arrayOperations.sumArrayElements(correctArr1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println(arrayOperations.sumArrayElements(wrongArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println(arrayOperations.sumArrayElements(wrongArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        System.out.println(arrayOperations.sumArrayElements(wrongArray2));
    }
}
