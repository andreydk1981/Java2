package Lesson_2_HW;

import java.util.Arrays;

public class App {
    private static final int LENGTH = 4;
    private static boolean ERROR = false;

    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"11", "11", "11", "11"},
                {"22", "22", "22", "22"},
                {"33", "33", "33", "33"},
                {"44", "44", "44", "44"}
        };

        try {
            System.out.println("Sum numbs of Array = " + convertArray(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            ERROR = true;
            System.out.println("Handle: " + e.getMessage());
        } finally {
            System.out.println(String.format("Program finished %s", ERROR ? "with ERROR" : "OK"));
        }

    }

    static int convertArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        checkArrLength(arr);
        System.out.println("Size of Array is OK");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Start check sum");
        int sum = 0;
        int num;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    num = Integer.parseInt(arr[i][j]);
                    sum += num;
                } catch (NumberFormatException exception) {
                    ERROR = true;
                    throw new MyArrayDataException(String.format("Not a num in Arr[%d][%d]", i, j));
                }
            }
        }
        return sum;
    }

    static void checkArrLength(String[][] arr) throws MyArraySizeException {
        if (arr.length != LENGTH)
            throw new MyArraySizeException(String.format("Error size column Array[%d][]", arr.length));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != LENGTH)
                throw new MyArraySizeException(String.format("Error Array[%d][%d] length", i, arr[i].length));
        }
    }
}
