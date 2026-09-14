class Solution {
    public int removeDuplicates(int[] nums) {
            if(nums.length == 0){
                return 0;
            }
            int k = 0;
            for(int i = 1; i < nums.length; i++){
                if(nums[i] != nums[k]){
                    k++;
                    nums[k] = nums[i];
                }
            }
            return k+1;
        // int idx = 0;
        // for (int num : nums) {
        //     if (idx == 0 || num != nums[idx - 1]) {
        //         nums[idx++] = num;
        //     }
        // }
        // return idx;
    }
}