package dsa;

import java.util.Arrays;

public class Testing {

    public static void insertionSort(int[] arr, int n) {
        // Base case
        if (n <= 1) return;

        // Sort first n-1 elements
        insertionSort(arr, n - 1);

        // Insert last element at its correct position
        int last = arr[n - 1];
        int j = n - 2;

        // Move elements of arr[0..n-1], that are greater than last, one position ahead
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        insertionSort(new int[]{1, 2, 232, 32, 312, 2323, 23}, 7);
       // System.out.println(Arrays.toString());
    }
}
