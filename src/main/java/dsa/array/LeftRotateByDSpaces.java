package dsa.array;

import java.util.Arrays;

public class LeftRotateByDSpaces {
    //Brute force
    public static void main(String[] args) {
        int[] inputArray = new int[]{1,2,3,4,5,6,7,8,9};
        int shifts = 3;

        shifts %= inputArray.length;

        int temp[] = Arrays.copyOfRange(inputArray, 0,shifts);

        for (int i = 0; i < inputArray.length-shifts; i++) {
            inputArray[i]=inputArray[i+shifts];
        }
        for (int i = 0; i < temp.length; i++) {
            inputArray[inputArray.length-shifts+i] = temp[i];
        }
        System.out.println(inputArray);
    }
}
