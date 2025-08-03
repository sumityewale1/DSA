package dsa;

public class Recursion {

    public static int factorialOfNNumber(int n) {
        if (n<1) {
            return 1;
        }
        return n * factorialOfNNumber(n-1);
    }

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+ " ");
        printNumber(--n);
    }

    static int sumOfNNumbers(int n) {
        if (n==0) {
            return 0;
        }
        return n+sumOfNNumbers(n-1);
    }

    static int printNTo1(int n) {
        if (n==1) {
            System.out.println(n);
            return 1;
        }
        System.out.println(n);
        return printNTo1(n-1);
    }

    static void printOneToN(int n) {
        if (n<1) {
            return ;
        }
        printOneToN(n-1);
        System.out.println(n);

    }


    public static void main(String[] args) {
        printOneToN(45);
        printNTo1(34);
        printNumber(100);
        int n = factorialOfNNumber(4);
        System.out.println();
        System.out.println(n);
        int sum = sumOfNNumbers(10);
        System.out.println(sum);
    }
}
