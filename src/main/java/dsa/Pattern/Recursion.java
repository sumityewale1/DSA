package dsa.Pattern;

public class Recursion {
    public static void printNumber(int n, int i) {

        if (i> n) {
            return;
        }
        printNumber(n-1, i);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumber(5, 1);
    }
}
