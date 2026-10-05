class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for (int i = 0; i < numbers.length - 1; i++) {
        //     for (int idx = i + 1; idx < numbers.length; idx++) {
        //         int sum = numbers[i] + numbers[idx];
        //         if (sum == target) {
        //             return new int[] { i + 1 , idx + 1 };
        //         }
        //     }
        // }
        // return null;
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) 
            {return new int[] {left + 1, right + 1}; }
            else if (sum < target) { left++; }
            else { right--; }
        }
        return null;
    }
}