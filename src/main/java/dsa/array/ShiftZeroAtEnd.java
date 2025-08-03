package dsa.array;

import java.util.Arrays;

public class ShiftZeroAtEnd {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1,2,0,0,0,2,20,3,0};

        int j=-1;

        for (int k = 0; k < inputArray.length; k++) {
            if(inputArray[k]==0) {
                j=k;
                break;
            }
        }
        if(j==-1) {
            return;
        }
        int i;
        for (i = j+1; i < inputArray.length; i++) {
            if(inputArray[i]!=0) {
            int temp = inputArray[i];
            inputArray[j]= inputArray[i];
            inputArray[i] = temp;
            j++;
            }
        };
        for (int k = j; k < inputArray.length; k++) {
            inputArray[k]=0;
        }
        System.out.println(Arrays.toString(inputArray));




    }
}
