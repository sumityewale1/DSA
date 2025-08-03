package dsa.array;

import java.util.Arrays;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] input1 = new int[]{1,2,3,4,5,6,7};
        int[] input2 = new int[]{1,2,3,4,5,6,7};

        int[] output = new int[input1.length+input2.length];
        int j = 0;
        int k=0;

        int z=0;
        while (j<=input1.length || k<=input2.length) {
            if (input1[j]<=input2[k]) {
                if (input1[j]<input2[k]) {
                    output[z]=input1[j];
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
