class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // int i = m - 1;      // Last valid element in nums1
        // int j = n - 1;      // Last element in nums2
        // int k = m + n - 1;  // Last position in nums1

        // while (i >= 0 && j >= 0) {
        //     if (nums1[i] > nums2[j]) {
        //         nums1[k] = nums1[i];
        //         i--;
        //     } else {
        //         nums1[k] = nums2[j];
        //         j--;
        //     }
        //     k--;
        // }

        // // Copy remaining elements from nums2
        // while (j >= 0) {
        //     nums1[k] = nums2[j];
        //     j--;
        //     k--;
        // }
        // int[] nums3 = new int[m + n];

        // for (int i = 0; i < m; i++) {
        //     nums3[i] = nums1[i];
        // }

        // for (int i = 0; i < n; i++) {
        //     nums3[m + i] = nums2[i];
        // }

        // Arrays.sort(nums3);

        // for (int i = 0; i < m + n; i++) {
        //     nums1[i] = nums3[i];
        // }

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}