class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int can1 = 0;
        // int can2 = 0;
        // int cou1 = 0;
        // int cou2 = 0;

        // // Find potential candidates
        // for (int num : nums) {
        //     if (num == can1) {
        //         cou1++;
        //     } else if (num == can2) {
        //         cou2++;
        //     } else if (cou1 == 0) {
        //         can1 = num;
        //         cou1 = 1;
        //     } else if (cou2 == 0) {
        //         can2 = num;
        //         cou2 = 1;
        //     } else {
        //         cou1--;
        //         cou2--;
        //     }
        // }

        // // Verify candidates
        // cou1 = 0;
        // cou2 = 0;

        // for (int num : nums) {
        //     if (num == can1) {
        //         cou1++;
        //     } else if (num == can2) {
        //         cou2++;
        //     }
        // }

        // List<Integer> result = new ArrayList<>();

        // if (cou1 > nums.length / 3) {
        //     result.add(can1);
        // }

        // if (cou2 > nums.length / 3) {
        //     result.add(can2);
        // }

        // return result;
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {

            if(result.contains(nums[i])) {
                continue;
            }

            int c = 0;

            for(int j = 0; j < n; j++) {
                if(nums[i] == nums[j]) {
                    c++;
                }
            }
            if(c > (n/3)) result.add(nums[i]);
        }
        return result;
    }
}