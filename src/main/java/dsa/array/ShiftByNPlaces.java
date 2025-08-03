package dsa.array;

import java.util.Arrays;

public class ShiftByNPlaces {
    public static void main(String[] args) {
        int inputArray[] = new int[]{1,2,3,4,5,6,7,8,9};
        int n = 3;

        int shift = n% inputArray.length;
        System.out.println(shift);
        int ns[] = Arrays.copyOfRange(inputArray, 0 , shift);
        for (int i = shift; i <inputArray.length ; i++) {
            inputArray[i-shift] = inputArray[i];
        }

        int count = 0;
        for (int i = inputArray.length-shift; i < inputArray.length; i++) {
            inputArray[i]= ns[count++];
        }
        System.out.println(Arrays.toString(inputArray));
    }
}
