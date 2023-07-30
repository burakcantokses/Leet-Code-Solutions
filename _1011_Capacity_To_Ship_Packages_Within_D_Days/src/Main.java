public class Main {

    public static void main(String[] args) {
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        int result = shipWithinDays(weights, days);
        System.out.println(result);
    }

    public static int shipWithinDays(int[] weights, int days) {
        int max = getMaxWeight(weights);
        int sum = getSum(weights);

        while (max < sum) {
            int mid = max + (sum - max) / 2;
            int requiredDays = calculateDays(weights, mid);
            if (requiredDays > days) {
                max = mid + 1;
            } else {
                sum = mid;
            }
        }

        return max;
    }

    private static int calculateDays(int[] weights, int capacity) {
        int days = 1;
        int currentWeight = 0;

        for (int weight : weights) {
            currentWeight += weight;
            if (currentWeight > capacity) {
                days++;
                currentWeight = weight;
            }
        }

        return days;
    }

    private static int getMaxWeight(int[] weights) {
        int max = Integer.MIN_VALUE;
        for (int weight : weights) {
            max = Math.max(max, weight);
        }
        return max;
    }

    private static int getSum(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }
}
