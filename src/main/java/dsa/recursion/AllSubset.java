package dsa.recursion;

public class AllSubset {
    public static boolean check(int[] nums) {

        return false;
      }

    public static void main(String[] args) {
        boolean yes = check(new int[]{4,5,6,7,2});
        System.out.println(yes);

    int n[] = new int[]{43,23,2,1,21,21,23,2,12,443,444443,444443};
        int smallest = n[0];
        int secodLargest = -1;

        for (int i = 1; i < n.length; i++) {
            if(n[i]<smallest) {
                secodLargest=smallest;
                smallest = n[i];
            }
        }
        System.out.println(secodLargest);
    }
}
