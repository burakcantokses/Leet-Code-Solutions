public class Main {
    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        System.out.println(minStartValue(nums));
    }

    public static int minStartValue (int[] nums) {
        int min = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
        }
        return 1 - min;
    }
}