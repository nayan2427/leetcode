import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  

public class pro39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] candidates,
                           int avail,
                           int st,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (avail == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (avail < 0) {
            return;
        }

        for (int i = st; i < candidates.length; i++) {

            // Choose
            current.add(candidates[i]);

            // Explore
            backtrack(
                candidates,
                avail - candidates[i],
                i,      // reuse same number
                current,
                result
            );

            // Undo choice
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] candidates1 = { 2, 3, 6, 7 };
        int target1 = 7;
        int[] candidates2 = { 2, 3, 5 };
        int target2 = 8;
        pro39 ob = new pro39();
        System.out.println(ob.combinationSum(candidates1, target1));
        System.out.println(ob.combinationSum(candidates2, target2));
    }
}