package dsa;

public class MaxSumSubarray {
    public static int maxSumSubarrayOfSizeK(int[] inputArray, int size, int k) {
        int start = 0;
        int end = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += inputArray[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < inputArray.length; i++) {
            windowSum=windowSum-inputArray[i-k]+inputArray[i];
            System.out.println("i - "+i+" "+k);
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;

    }

    public static void main(String[] args) {
      int maxSum = maxSumSubarrayOfSizeK(new int[]{1, 2, 3, 4, 2, 12, 23}, 7, 3);
        System.out.println(maxSum);
    }
}
