class Solution {
    public int removeDuplicates(int[] nums) {
            // if(nums.length == 0){
            //     return 0;
            // }
            // int k = 0;
            // for(int i = 1; i < nums.length; i++){
            //     if(nums[i] != nums[k]){
            //         k++;
            //         nums[k] = nums[i];
            //     }
            // }
            // return k+1;
        // int idx = 0;
        // for (int num : nums) {
        //     if (idx == 0 || num != nums[idx - 1]) {
        //         nums[idx++] = num;
        //     }
        // }
        // return idx;

        if(nums.length == 0) return 0;

        int n = nums.length;
        int c = 0;
        for(int i = 1; i < n; i++) {
            if(nums[c] != nums[i]) {
                c++;
                nums[c] = nums[i];
            }
        }
        return c + 1;
    }
}