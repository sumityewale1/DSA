package dsa.sorting;

import java.util.Arrays;

public class Soritng {

    public static int[] bubbleSort(int[] inputArray){

        for (int i = 0; i < inputArray.length; i++) {
int flag = 0;
            for (int j = 0; j < inputArray.length -1; j++) {
                if (inputArray[j]>inputArray[j+1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] =temp;
                    flag++;
                }
            }
            if (flag==0) {
                break;
            }
        }

        return inputArray;
    }

    public static int[] selectionSort(int[] inputArray){

        for (int i = 0; i < inputArray.length; i++) {
        int smallest  = i;
            for (int j = i; j < inputArray.length -1; j++) {
                if (inputArray[j]<inputArray[smallest]) {
                   smallest = j;
                }
            }
            inputArray[i] = inputArray[smallest];

        }

        return inputArray;
    }

    public static int[] insertionSort(int[] inputArray){

        for (int i = 1; i < inputArray.length; i++) {
            int j = i-1;
            int key = inputArray[i];
            while (j>=0 && inputArray[j]>key) {
                inputArray[j+1] = inputArray[j];
                j--;
            }
            inputArray[j+1]=key;

        }

        return inputArray;
    }


    public static void main(String[] args) {
    int[]  n = bubbleSort(new int[]{0,5,344,3,232,32,3});

        int k[] = selectionSort(n);
        System.out.println("selection sort output - "+Arrays.toString(k));

        int kd[] = insertionSort(n);
        System.out.println("Insertion sort output - "+Arrays.toString(kd));
        System.out.println("Bubble sort output -    "+Arrays.toString(n));
    }
}
