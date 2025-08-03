package dsa;

import java.util.Arrays;

public class Sorting {
    public static int[] bubbleSort(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            boolean isSorted = false;
            for (int j = 0; j < inputArray.length - 1; j++) {

                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                    isSorted = true;
                    System.out.println("Sorted");
                }

            }

            if (!isSorted) {
                return inputArray;
            }

        }
        return inputArray;
    }

    public static int[] insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            System.out.println("i --- "+i);
            int start = i - 1;
            int key = inputArray[i];
            while (start >= 0 && inputArray[start] > key) {
                System.out.println("start == " + start + "--" + Arrays.toString(inputArray));
                inputArray[start + 1] = inputArray[start];
                start--;
            }
            inputArray[start + 1] = key;
            System.out.println("At end-- "+ Arrays.toString(inputArray));
        }
        return inputArray;
    }

    public static int[] selectionSort(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {

            int smallestindex = i;

            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[smallestindex] > inputArray[j]) {
                    smallestindex = j;
                }
            }

            int temp = inputArray[i];
            inputArray[i] = inputArray[smallestindex];
            inputArray[smallestindex] = temp;

        }
        return inputArray;
    }

    public static void main(String[] args) {
        // int[] array = bubbleSort(new int[]{6, 2, 3, 4, 5});
        int[] array = insertionSort(new int[]{5, 4, 3, 2, 1});
        System.out.println(Arrays.toString(array));
    }
}
