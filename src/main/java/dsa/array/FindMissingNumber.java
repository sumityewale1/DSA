package dsa.array;

public class FindMissingNumber {
    public static void main(String[] args) {

        //Brute force
        int[] inputArray = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10};

        for (int i = 1; i < inputArray.length; i++) {
            boolean exists = false;
            for (int j = 0; j < inputArray.length; j++) {
                if (i == inputArray[j]) {
                    exists = true;
                }
            }
            if (exists == false) {
                System.out.println(i);
            }
        }

        // Better solution
        int sum = (inputArray.length * (inputArray.length + 1)) / 2;
        System.out.println(sum);

        for (int j : inputArray) {
            sum -= j;
        }
        System.out.println(Math.abs(sum));
    }
}
