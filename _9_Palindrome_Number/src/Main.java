public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        boolean isPalindrome;
        String reverseNumber = "";
        String number = String.valueOf(x);
        for (int i = number.length()-1; i >= 0; i--) {
            reverseNumber = reverseNumber + String.valueOf(x).charAt(i);
        }
        System.out.println(reverseNumber + " " + number);
        if (reverseNumber.trim().equals(number.trim())) {
            isPalindrome = true;
        }else {
            isPalindrome = false;
        }
        return isPalindrome;
    }
}