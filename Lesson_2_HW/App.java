package Lesson_2_HW;

import java.util.Arrays;

public class App {

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
            System.out.println("Handle: " + e.getMessage());
        }

    }

    static int convertArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) throw new MyArraySizeException(String.format("Error size column Array[%d][]", arr.length));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4)
                throw new MyArraySizeException(String.format("Error Array[%d][%d] length", i, arr[i].length));
        }
        System.out.println("Size of Array is OK");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Start check sum");
        int sum = 0;
        int num;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    num = Integer.parseInt(arr[i][j]);
                    sum +=num;
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(String.format("Not a num in Arr[%d][%d]", i, j));
                }
            }

        }
        return sum;
    }
}
