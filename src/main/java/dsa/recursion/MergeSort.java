package dsa.recursion;

public class MergeSort {

    public static void mergeSort(int[] inputArray, int low, int high) {
        System.out.println("Entering mergeSort: low = " + low + ", high = " + high);

        if (low >= high) {
            System.out.println("Base case hit: low = " + low + ", high = " + high);
            return;
        }

        int mid = (low + high) / 2;
        System.out.println("  Dividing: low = " + low + ", mid = " + mid + ", high = " + high);

        mergeSort(inputArray, low, mid);         // Left half
        mergeSort(inputArray, mid + 1, high);    // Right half

        System.out.println("Merging: low = " + low + ", mid = " + mid + ", high = " + high);
        merge(inputArray, low, mid, high);

        System.out.println("Exiting mergeSort: low = " + low + ", high = " + high);
        System.out.println();
    }

    private static void merge(int[] inputArray, int low, int mid, int high) {
        int[] L = new int[mid - low + 1];
        int[] R = new int[high - mid];

        for (int i = 0; i < L.length; i++) {
            L[i] = inputArray[low + i];
        }
        for (int i = 0; i < R.length; i++) {
            R[i] = inputArray[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;

        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                inputArray[k++] = L[i++];
            } else {
                inputArray[k++] = R[j++];
            }
        }

        while (i < L.length) {
            inputArray[k++] = L[i++];
        }
        while (j < R.length) {
            inputArray[k++] = R[j++];
        }
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{6, 3, 9, 5, 2, 8};

        System.out.println("Original array:");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        mergeSort(inputArray, 0, inputArray.length - 1);

        System.out.println("Sorted array:");
        for (int i : inputArray) {
            System.out.print(i + " ");
        }
    }
}
