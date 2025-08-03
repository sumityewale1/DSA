package dsa;

public class DivisorsOfANumber {

    static int findTheCountOfFactors(int n) {
        int count=0;
        int index=1;
        for (index = 1; index*index < n; index++) {

            if (n%index==0) {
                count+=2;
            }
        }
        if ((index)*(index)==n){
            count+=1;
        }
        return count;
    }

    public static int[] divisors(int n) {

        int count = 0;
        for (int index = 1; index <= Math.sqrt(n); index++) {
            if (n % index == 0) {
                count++;

                if (index != n / index) {
                    count++;
                }
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result[index++] = i;

                if (i != n / i) {
                    result[index++] = n / i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = findTheCountOfFactors(24);
        System.out.println(n);
        System.out.println(divisors(56));
    }
}
