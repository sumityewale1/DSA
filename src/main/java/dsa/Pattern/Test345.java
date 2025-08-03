package dsa.Pattern;

public class Test345 {

    public static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++) {

            for (int j = 0;j<arr.length;j++) {

                if (arr[i]==(arr[j]+arr[j])) {
                    System.out.println(arr[i]+"--"+(arr[j]+arr[j]));
                    return true;
                }

            }
        }
        return false;
    }

    public static int check() {
        int[] nums = new int[]{2,3,1,2,4,3};

        int start = 0, end=0;

        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int target = 7;
        while (end<=nums.length) {
           sum+=nums[end];
           end++;
           while (start<end &&ans>=target) {
            ans = Math.min(ans, end-start);
            sum -=nums[start];
            start++;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(check());
    }
}
