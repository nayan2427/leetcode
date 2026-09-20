class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int []temp = new int[n];
        for(int i = 0; i < n; i++){
            sum += nums[i];
            for(int j = i; j < n; j++){
                temp[j] = sum;
            }
        }
        return temp;
    }
}