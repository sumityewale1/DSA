package dsa.Pattern;

public class Pattern {
    public static void print1() {

        int n= 3;
        int space = 0;
        for (int i = n; i >0 ; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <(2 * (n - i)); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern.print1();
    }
}
