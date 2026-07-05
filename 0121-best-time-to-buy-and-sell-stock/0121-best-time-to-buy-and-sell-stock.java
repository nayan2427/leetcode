class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxp = 0;
        for(int i = 0; i < n; i++){
            if(prices[i] < min){
                min = prices[i];
            }else if (prices[i] - min > maxp){
                maxp = prices[i] - min;
            }
        }
        return maxp;
    }
}