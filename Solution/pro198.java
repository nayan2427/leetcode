public class pro198 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int [] total = new int[n];
        total[0] = nums[0];
        total[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < n; i++) {
            total[i] = Math.max(nums[i] + total[i - 2], total[i - 1]);
        }
        return total[n - 1];
    }
    public static void main(String [] args) {
        int [] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
        int [] nums2 = {2, 7, 9, 3, 1};
        System.out.println(rob(nums2));
    }
}
