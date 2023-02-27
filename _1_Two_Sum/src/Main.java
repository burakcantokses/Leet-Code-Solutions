public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] result = twoSum(nums, 6);
        System.out.println("["+result[0]+","+result[1]+"]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int total = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j){
                    continue;
                }
                total = nums[i]+nums[j];
                if (total == target) {
                    result[0] = j;
                    result[1] = i;
                    break;
                }
            }
            if (total == target) {
                break;
            }
        }
        return result;
    }
}