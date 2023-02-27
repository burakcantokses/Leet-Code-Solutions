import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(romanToInt("XXI"));
    }
    public static int romanToInt(String s) {
        int number = 0;
        String key = "";
        HashMap<String,Integer> romans = new HashMap<String, Integer>();
        {
            romans.put("I", 1);
            romans.put("V", 5);
            romans.put("X", 10);
            romans.put("L", 50);
            romans.put("C", 100);
            romans.put("D", 500);
            romans.put("M", 1000);
        }
        List<String> checkedValue = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            key = String.valueOf(s.charAt(i));
            checkedValue.add(key);
            number += romans.get(key);
        }
        return number;
    }
}
