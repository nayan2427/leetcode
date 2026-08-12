class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, h = (m * n) - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int r = mid / n;
            int c = mid % n;
            int mid_val = matrix[r][c];
            if (mid_val == target) {
                return true;
            } else if (mid_val < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

        }
        return false;

        // Brute form but not satinot satisfy the required O(log(m * n)) constraint.
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }

        // return false;
    }
}