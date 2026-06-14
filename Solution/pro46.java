import java.util.ArrayList;
import java.util.List;

public class pro46 {
    List<List<Integer>> per = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];

        backtrack(nums, cur, vis);
        return per;
    }

    private void backtrack(int[] nums, List<Integer> cur, boolean[] vis) {

        if (cur.size() == nums.length) {
            per.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (vis[i])
                continue;
            cur.add(nums[i]);
            vis[i] = true;
            backtrack(nums, cur, vis);
            cur.remove(cur.size() - 1);
            vis[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] number = { 1, 2, 3 };
        pro46 ob = new pro46();
        System.out.println(ob.permute(number));
    }
}