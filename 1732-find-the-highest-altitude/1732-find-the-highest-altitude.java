class Solution {
    public int largestAltitude(int[] gain) {
        // int n = gain.length;
        // int[] temp = new int[n+1];
        // temp[0] = 0;
        // for(int i = 1; i < n + 1; i++){
        //     temp[i] = temp[i - 1] + gain[i - 1];
        // }
        // int max = Arrays.stream(temp).max().getAsInt();
        // return max;
        int max = 0;
        int al = 0;
        for(int i = 0; i < gain.length; i++){
            al += gain[i];
            max = Math.max(max, al);
        }
        return max;


    }
}