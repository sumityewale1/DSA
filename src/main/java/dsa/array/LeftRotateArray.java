package dsa.array;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1,2,3,4,5};

        int temp = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
        inputArray[i-1] = inputArray[i];

        }
//        inputArray[0] = inputArray[inputArray.length-1];
        inputArray[inputArray.length-1] = temp;
        System.out.println(Arrays.toString(inputArray));
    }
}
