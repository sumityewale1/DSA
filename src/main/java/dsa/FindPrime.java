package dsa;

public class FindPrime {
    public static boolean isPrime(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPrime = isPrime(42);
        System.out.println(isPrime);
    }
}
