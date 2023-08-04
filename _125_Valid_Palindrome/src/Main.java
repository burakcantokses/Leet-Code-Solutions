import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(" "))
            return true;
        String clearedStr = s.trim().replaceAll(" ", "")
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        String reversedStr = reverseString(clearedStr);
        if (reversedStr.length() <= 1)
            return true;
        return reversedStr.equals(clearedStr);
    }

    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length()-1; i>=0 ; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}