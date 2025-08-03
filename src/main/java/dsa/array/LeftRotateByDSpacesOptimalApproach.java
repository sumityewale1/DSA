package dsa.array;

import java.util.Arrays;

public class LeftRotateByDSpacesOptimalApproach {
    public static void main(String[] args) {
        int inputArray[] = new int[]{-1,-100,3,99};
        int shifts = 2 % inputArray.length;

//        reverse(inputArray, 0, shifts);
//        System.out.println(Arrays.toString(inputArray));
//        reverse(inputArray, shifts+1, inputArray.length-1);
//        System.out.println(Arrays.toString(inputArray));
//        reverse(inputArray, 0, inputArray.length-1);
//        System.out.println(Arrays.toString(inputArray));
        reverse(inputArray, 0, shifts - 1); // fix: reverse first 'd' elements
        reverse(inputArray, shifts, inputArray.length - 1); // fix: reverse rest
        reverse(inputArray, 0, inputArray.length - 1); // reverse the whole array
        System.out.println(Arrays.toString(inputArray));
    }

    private static void reverse(int[] inputArray, int start, int end) {
        while (start<end) {
            int temp = inputArray[start];
            inputArray[start]=inputArray[end];
            inputArray[end--]=temp;
            start++;
        }
    }
}
