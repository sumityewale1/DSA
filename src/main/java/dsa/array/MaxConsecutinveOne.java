package dsa.array;

public class MaxConsecutinveOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int i=0;i<nums.length;i++) {
            if (nums[i]==1) {
                count++;
            }
            else {
                max = count;
                count=0;
            }

            if (count>max) {
                max = count;
            }
        }
        return max+1;
    }

    public static void main(String[] args) {
        int max = findMaxConsecutiveOnes(new int[]{1,0,1,0,1,0,1,1,1,1,1, 0,1});
        System.out.println(max);
    }
}
