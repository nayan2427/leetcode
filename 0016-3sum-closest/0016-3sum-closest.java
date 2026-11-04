class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // int n = nums.length;
        // int closeSum = nums[0] + nums[1] + nums[2];
        // for(int i = 0; i < n; i++) {
        //     for(int j = i + 1; j < n - 1; j++) {
        //         for(int k = j + 1; k < n; k++) {
        //             int sum = nums[i] + nums[j] + nums[k];

        //             if(Math.abs(target - sum) < Math.abs(target - closeSum)) {
        //                 closeSum = sum;
        //             }
        //             if(sum == target) {
        //                 return sum;
        //             }
        //         }
        //     }
        // }
        // return closeSum;
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                if(sum == target) {
                    return sum;
                }
                else if(sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }

        }
        return closestSum;

    }
}