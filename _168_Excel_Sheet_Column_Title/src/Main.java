public class Main {
    public static void main(String[] args) {
        System.out.println(convertExcelColumn(1)); // A
        System.out.println(convertExcelColumn(28)); // AB
        System.out.println(convertExcelColumn(701)); // ZY
        System.out.println(convertExcelColumn(2147483647)); // FXSHRXW
    }

    public static String convertExcelColumn(int x) {
        StringBuilder sb = new StringBuilder();
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        while (x > 0) {
            x--;
            sb.append(alphabet[x % 26]);
            x /= 26;
        }
        return sb.reverse().toString();
    }
}