class Solution {
    public int removeDuplicates(int[] nums) {
        //two pointers
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

        // Single pointer withc for each loop
        // int idx = 0;
        // for (int num : nums) {
        //     if (idx == 0 || num != nums[idx - 1]) {
        //         nums[idx++] = num;
        //     }
        // }
        // return idx;


        // Single pointer with normal for loop
        if(nums.length == 0) return 0;

        int n = nums.length;
        int c = 1;
        for(int i = 1; i < n; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}