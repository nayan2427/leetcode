class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;

        int[] cust = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cust[i] += accounts[i][j];
            }
        }
        int max = 0;
        for (int i = 0; i < cust.length; i++) {
            if (cust[i] > max) {
                max = cust[i];
            }
        }
        return max;
    }
}