import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]{)"));
    }
    public static boolean isValid(String s) {
        if (s.length()%2!=0) {
            return false;
        }
        HashMap<String, String> keys = new HashMap<String, String>();
        keys.put("(", ")");
        keys.put("[", "]");
        keys.put("{", "}");
        String key = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                key = keys.get(String.valueOf(s.charAt(i)));
                if (!String.valueOf(s.charAt(i+1)).equalsIgnoreCase(keys.get(String.valueOf(s.charAt(i))))) {
                    return false;
                }
            }
        }
        return true;
    }
}