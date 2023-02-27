public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();
        String longestPrefix = "";
        int k = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            commonPrefix.append(strs[0].charAt(k));
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(commonPrefix.toString())) {
                    return longestPrefix;
                }
            }
            longestPrefix = commonPrefix.toString();
            k++;
        }
        return longestPrefix;
    }
}