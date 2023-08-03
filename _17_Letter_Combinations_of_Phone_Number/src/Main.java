import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combin = new ArrayList<>();
        if (Objects.equals(digits, "") || digits == null) {
            return combin;
        }
        HashMap<Character, String> phone = new HashMap<>();
        phone.put('2', "abc");
        phone.put('3', "def");
        phone.put('4', "ghi");
        phone.put('5', "jkl");
        phone.put('6', "mno");
        phone.put('7', "pqrs");
        phone.put('8', "tuv");
        phone.put('9', "wxyz");

        backtrack(combin, phone, digits, new StringBuilder(), 0);
        return combin;
    }

    public static void backtrack(List<String> combinations, HashMap<Character, String> phone, String digits,
                                  StringBuilder current, int index) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = phone.get(digit);

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            current.append(letter);
            backtrack(combinations, phone, digits, current, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}