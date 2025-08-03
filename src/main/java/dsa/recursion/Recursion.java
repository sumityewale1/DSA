package dsa.recursion;

public class Recursion {
    public static int printNumber(int n) {
        if (n == 0) {
            // System.out.println(n);
            return n;
        }
        int nd = n + printNumber(n - 1);
        System.out.println("Output of the n - "+nd);
        return nd;
    }

    public static void main(String[] args) {
        int n = printNumber(10);
        System.out.println(n);
    }
}
