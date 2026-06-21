import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pro90 {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            current.add(nums[i]);

            backtrack(i + 1, nums, current, result);

            current.remove(current.size() - 1);
        }
    }
    public static void main (String [] args) {
        pro90 obj = new pro90();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 2};
        System.out.println(obj.subsetsWithDup(nums1));
        System.out.println(obj.subsetsWithDup(nums2));
    }
}
