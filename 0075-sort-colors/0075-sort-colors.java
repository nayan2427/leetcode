class Solution {
    public void sortColors(int[] nums) {
        // int l = 0, h = nums.length - 1;
        // int mid = 0;
        // while(mid <= h){
        //     if(nums[mid] == 0){
        //         int temp = nums[l];
        //         nums[l] = nums[mid];
        //         nums[mid] = temp;
        //         l++;
        //         mid++;
        //     }
        //     else if(nums[mid] == 1){
        //         mid++;
        //     }
        //     else{
        //         int temp = nums[mid];
        //         nums[mid] = nums[h];
        //         nums[h] = temp;
        //         h--;
        //     }
        // }
        int low = 0, high = nums.length - 1;
        int mid = 0;
        while( mid <= high){
            if(nums[mid] == 0){
                int temp1 = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp1;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp2 = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp2;
                high--;
            }
        }
    }
}