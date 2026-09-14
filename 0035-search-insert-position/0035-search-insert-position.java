class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int k = 0; k < n; k++){
            if(nums[k] == target) return k;
            else if (nums[k] >= target) return k;
        }
        return n;
    }
}