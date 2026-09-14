class Solution {
    public int findMaxLength(int[] nums) {
        // int sum = 0;
        // int maxlength = 0;
        // HashMap<Integer,Integer> map = new HashMap <>();
        // map.put(0, -1);


        // for(int i = 0; i < nums.length; i++){
        //      if (nums[i] == 0) {
        //         sum--;
        //     } else {
        //         sum++;
        //     }
        //      if(map.containsKey(sum)) {
        //         int length = i - map.get(sum);
        //         maxlength = Math.max(maxlength, length);
        //     }
        //     else{
        //         map.put(sum,i);
        //     }
        // }
        // return maxlength;
        int n = nums.length;
        int sum = 0;
        int maxLength = 0;

        int[] first = new int[2 * n + 1];
        Arrays.fill(first, - 2);

        first[n] = -1;

        for (int i = 0; i < n; i++){
            sum += (nums[i] == 0) ? -1 : 1;

            int idx = sum + n;

            if(first[idx] != -2){
                maxLength = Math.max(maxLength, i - first[idx]);
            }
            else {
                first[idx] = i;
            }   
        }
        return maxLength;
    }
}