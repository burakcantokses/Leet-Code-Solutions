import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arrays.stream(sort(new int[]{4, 2, 5, 7})).toArray()));
    }
    public static int[] sort(int[] nums) {
        int n = nums.length;
        int[] singleArr = new int[n/2];
        int[] doubleArr = new int[n/2];
        int singleCount = 0;
        int doubleCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                doubleArr[doubleCount] = num;
                doubleCount++;
            }
            if (num % 2 == 1) {
                singleArr[singleCount] = num;
                singleCount++;
            }
        }
        singleCount = 0;
        doubleCount = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                result[i] = doubleArr[doubleCount];
                doubleCount++;
            }
            if (i%2 == 1) {
                result[i] = singleArr[singleCount];
                singleCount++;
            }
        }
        return result;

    }
}