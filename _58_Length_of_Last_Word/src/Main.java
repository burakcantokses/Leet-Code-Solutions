public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello world"));
    }
    public static int lengthOfLastWord(String s) {
        int length = s.length();
        s = s.trim();
        String[] wordArray = s.split(" ");
        length = wordArray[wordArray.length-1].length();
        return length;
    }
}