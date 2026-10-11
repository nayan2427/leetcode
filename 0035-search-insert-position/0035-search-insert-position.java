class Solution {
    public int searchInsert(int[] nums, int target) {
        // int n = nums.length;
        // for(int k = 0; k < n; k++){
        //     if(nums[k] == target) return k;
        //     else if (nums[k] >= target) return k;
        // }
        // return n;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
}