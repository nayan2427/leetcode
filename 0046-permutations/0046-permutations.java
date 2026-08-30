class Solution {
    List<List<Integer>> perm = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];

        backtrack(nums, cur, vis);
        return perm;
    }

    private void backtrack(int[] nums, List<Integer> cur, boolean[] vis) {

        if(cur.size() == nums.length){
            perm.add(new ArrayList<>(cur));
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
}