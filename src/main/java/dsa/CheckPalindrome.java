package dsa;

public class CheckPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        return checkPalindrome(s.toLowerCase().replace(" ", ""), start, end);
    }

    static boolean checkPalindrome(String s, int start, int end) {
        if (start>=end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return checkPalindrome(s, start+1, end-1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
