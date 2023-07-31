import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
                };
        kWeakestRows(mat, 3);
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> allSoldiers = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    counter++;
                }
            }
            allSoldiers.put(i, counter);
            counter = 0;
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(allSoldiers.entrySet());

        entryList.sort(Map.Entry.comparingByValue());

        List<Map.Entry<Integer, Integer>> sortedData = entryList.subList(0, k);
        int i = 0;
        int[] soldiers = new int[k];
        for (Map.Entry<Integer, Integer> entry : sortedData) {
            soldiers[i] = entry.getKey();
            i++;
            System.out.println(entry);
        }

        return soldiers;
    }
}