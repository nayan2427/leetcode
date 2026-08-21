class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int maxlength = 0;
        HashMap<Integer,Integer> map = new HashMap <>();
        map.put(0, -1);


        for(int i = 0; i < nums.length; i++){
             if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }
            // if(sum == 0){
            //     maxlength = i + 1;
            // }
             if(map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxlength = Math.max(maxlength, length);
            }
            else{
                map.put(sum,i);
            }
        }
        return maxlength;
    }
}