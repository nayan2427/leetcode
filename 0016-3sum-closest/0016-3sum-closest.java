class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closeSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if(Math.abs(target - sum) < Math.abs(target - closeSum)) {
                        closeSum = sum;
                    }
                    if(sum == target) {
                        return sum;
                    }
                }
            }
        }
        return closeSum;
    }
}