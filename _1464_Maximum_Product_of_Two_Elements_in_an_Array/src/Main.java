public class Main {
    public static void main(String[] args) {
        System.out.println(max(new int[]{3, 4, 5, 2}));
    }

    //nums i j (nums[i]-1)*(nums[j]-1)
    public static int max(int[] nums) {
        int maxNumber = 0;
        int currentNumber;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
               currentNumber = (nums[i] - 1) * (nums[j] - 1);
               if (currentNumber > maxNumber) {
                   System.out.println("i: " + i + " j: " + j + " currentNumber: " + currentNumber + " maxNumber: " + maxNumber);
                   maxNumber = currentNumber;
               }
            }
        }
        return maxNumber;
    }
}