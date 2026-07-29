class Solution {
    public int findDuplicate(int[] nums) {
        // Arrays.sort(nums);

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1])
        //         return nums[i];
        // }
        // return -1;
        int[] freq = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            if(freq[nums[i]] == 0){
                freq[nums[i]]++;
            }else{
                return nums[i];
            }
        }
        return -1;
    }
}