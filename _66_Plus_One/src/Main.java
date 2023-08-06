import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int gives = 1;
        int sum;
        for (int i = digits.length-1; i>=0; i--) {
            sum = digits[i] + gives;
            digits[i] = sum % 10;
            gives = sum / 10;
        }

        if (gives > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = gives;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else {
            return digits;
        }
    }
}