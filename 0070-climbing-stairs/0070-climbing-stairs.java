class Solution {
    int[] total;
    public int climbStairs(int n) {
        total = new int[n + 1];
        return trick(n);
    }
    private int trick(int n){
        if(n <= 2) return n;
        if(total[n] != 0) return total[n];

        total[n] = trick(n - 1) + trick(n - 2);

        return total[n];
    }
}