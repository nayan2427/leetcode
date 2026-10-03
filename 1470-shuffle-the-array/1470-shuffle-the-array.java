class Solution {
    public int[] shuffle(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int temp = nums[n + i];
            for (int j = n + i; j > 2 * i + 1; j--) {
                nums[j] = nums[j - 1];
            }
            nums[2 * i + 1] = temp;
        }
        return nums;
    }
}