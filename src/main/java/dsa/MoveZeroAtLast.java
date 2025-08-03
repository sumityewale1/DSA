package dsa;

public class MoveZeroAtLast {
    public static void moveX(int[] nums) {
        int lastZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                nums[lastZeroIndex++] = nums[i];
            }
        }

        for (int i = lastZeroIndex; i < nums.length; i++) {
            nums[i]=0;
        }

        System.out.println(nums.toString());
    }
    public static void main(String[] args) {
        moveX(new int[]{1,0,5,4,3});
    }
}
