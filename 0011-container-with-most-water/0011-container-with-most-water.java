class Solution {
    public int maxArea(int[] height) {
        // int max = 0;
        // int left = 0;
        // int right = height.length - 1;

        // while (left < right) {

        //     int width = right - left;
        //     int area = Math.min(height[left], height[right]) * width;

        //     max = Math.max(max, area);

        //     if (height[left] < height[right]) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }

        // return max;
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while(l < r) {
            int w = r - l;
            int area = Math.min(height[l] , height[r]) * w;

            max = Math.max(max, area);

            if(height[l] < height[r]) {
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}