package dsa;

public class RemoveDuplicatesFromSortedArrays {
    public static void remvoeDu(int[] input) {
        int i=0;
        for (int j = 0; j < input.length; j++) {

            if(j<2 || input[j]!=input[i-2]) {
                input[i++]=input[j];
            }
        }

        System.out.println(i);
    }

    public static void main(String[] args) {
        remvoeDu(new int[] {1,1,1,2,2,3});
    }
}
