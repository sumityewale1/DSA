import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public char[] reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char arr[] = s.toCharArray();
        int start=0,end=s.length()-1;

        while(start<end) {
        while (start<end && vowels.indexOf(start)==-1) {
            start++;
        }

        while (start<end && vowels.indexOf(end)==-1) {
            end--;
        }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
return arr;
}

    static String removeTheTwoUpcomingVowels(String inputStrin) {
        char[] chars = inputStrin.toCharArray();
String vowels = "aeiou";
        String outPutString = "";
        for (int i = 0; i < chars.length; i++) {

            if (vowels.indexOf(chars[i]) != -1 && vowels.indexOf(chars[i-1])!=-1) {
                outPutString += "";
            }  else {
                outPutString+=chars[i];
            }
        }
        return outPutString;
    }


    public static String removeDuplicates(String s) {
        String outputString = ""+s.charAt(0);
        for (int i =1;i<s.length();i++) {

            if (s.charAt(i)!=s.charAt(i-1)) {
                outputString+=s.charAt(i);
            }
        }
        return outputString;
    }

    public static void main(String[] args) {
        String s = removeDuplicates("sssumit");
        System.out.println(s);
        String outputString = removeTheTwoUpcomingVowels("sumitaeiou");
        System.out.println(outputString);
        String input = "Suoionddaeayee";
        // String output = "Sundayy";
        String vowels = "aeiouAEIOU";
        String output = IntStream.range(0, input.length()).mapToObj(i -> {
            char prevChar = input.charAt(i);
            if (i > 0) {
                char curr = input.charAt(i - 1);

                if (vowels.indexOf(curr) != -1 && vowels.indexOf(prevChar) != -1) {
                    return "";
                }
            }
            return String.valueOf(prevChar);
        }).collect(Collectors.joining());
        System.out.println(output);
    }

}
