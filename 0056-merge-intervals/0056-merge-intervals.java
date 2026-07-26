class Solution {
    public int[][] merge(int[][] intervals) {
        
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // for (int i = 0; i < intervals.length - 1; i++) {
        //     for (int j = 0; j < intervals.length - i - 1; j++) {
        //         if (intervals[j][0] > intervals[j + 1][0]) {
        //             int[] temp = intervals[j];
        //             intervals[j] = intervals[j + 1];
        //             intervals[j + 1] = temp;
        //         }
        //     }
        // }
        int[] cur = intervals[0];
        List<int[]> result = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            if (cur[1] >= intervals[i][0]) {
                cur[1] = Math.max(cur[1], intervals[i][1]);
            } else {
                result.add(cur);
                cur = intervals[i];
            }
        }
        result.add(cur);
        return result.toArray(new int[result.size()][]);
    }
}