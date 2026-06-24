import java.util.Arrays;

public class pro1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 7, 11, 15 };
        int[] nums2 = { 3, 2, 4 };
        pro1 ob = new pro1();
        System.out.println(Arrays.toString(ob.twoSum(nums1, 9)));
        System.out.println(Arrays.toString(ob.twoSum(nums2, 6)));
    }
}
