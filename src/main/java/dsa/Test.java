package dsa;

public class Test {
    public static int[] twoSum(int[] numbers, int target) {
        int right = numbers.length-1, left=0;

        while(left<right) {
            int sum = numbers[left]+numbers[right];

            if (sum==target) {
                return new int[]{left+1, right+1};
            } else if (sum<target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        twoSum(new int[] {1,2,4,342,323}, 6);
    }
}
