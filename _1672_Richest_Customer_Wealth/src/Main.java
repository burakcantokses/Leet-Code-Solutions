public class Main {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxMoney = 0;
        int tempMaxMoney = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                tempMaxMoney += accounts[i][j];
            }
            if (tempMaxMoney > maxMoney)
                maxMoney = tempMaxMoney;
            tempMaxMoney = 0;
        }
        return maxMoney;
    }
}