class Solution {
    public int[] runningSum(int[] nums) {
    //    int n = nums.length;
    //    int sum = 0;
    //    int[] temp = new int[n];
    //    for(int i = 0; i < n; i++) {
    //     sum += nums[i];
    //     temp[i] = sum;
    //    }
    //    return temp;
    for(int i = 1; i < nums.length; i++) {
        nums[i] = nums[i] + nums[i - 1];
    }
    return nums;
    }
}