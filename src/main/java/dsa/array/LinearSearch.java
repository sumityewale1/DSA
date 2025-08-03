package dsa.array;

public class LinearSearch {
    public static boolean linearSearch(int[] inputArray, int key) {

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i]==key) {
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
      boolean b = linearSearch(new int[]{1,2,3,4,4,4,44444,}, 34);
        System.out.println(b);
    }
}
