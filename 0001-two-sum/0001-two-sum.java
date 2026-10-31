class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int K = i + 1; K < nums.length; K++) {
        //         if (nums[i] + nums[K] == target) {
        //             return new int[] {i, K};
        //         }
        //     }
        // }
        // return null;
        Map<Integer, Integer> map =  new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if(map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}