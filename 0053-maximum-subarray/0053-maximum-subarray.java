class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        // int maxSum = nums[0];
        // int sum = nums[0];

        // for(int i=1;i<nums.length;i++){
        //     if(sum>=0){
        //         sum += nums[i];
        //     }else{
        //         sum = nums[i];
        //     }
        //     if(sum>maxSum){
        //         maxSum = sum;
        //     }
        // }
        for(int x : nums){
            sum += x;
            maxSum = Math.max(maxSum, sum);
            
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}