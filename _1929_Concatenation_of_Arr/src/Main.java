public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        for (int i = 0; i < getConcatenation(nums).length; i++) {
            System.out.println(getConcatenation(nums)[i]);
        }
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int numsId = 0;
        for (int i = 0; i < ans.length; i++) {
            if (numsId == nums.length) {
                numsId = 0;
            }
            ans[i] = nums[numsId];
            numsId++;
        }
        return ans;
    }
}