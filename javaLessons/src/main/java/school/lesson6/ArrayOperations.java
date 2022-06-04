package school.lesson6;

public class ArrayOperations {
    public int sumArrayElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int arraySize = 4;
        int sum = 0;
        if (arr.length != arraySize || arr.length != arraySize) {
            throw new MyArraySizeException("The size of current array must be 4x4!!!");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arraySize) {
                throw new MyArraySizeException("The size of current array must be 4x4!!!");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.valueOf(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Formation failed. In arr[" + i + "]["
                            + j + "] exists wrong element with value: " + arr[i][j]);
                }
            }
        }
        return sum;
    }
}
