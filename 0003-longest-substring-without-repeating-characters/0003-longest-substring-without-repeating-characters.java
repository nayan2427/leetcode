import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int left = 0, right = 0, maxLength = 0;
        // HashSet<Character> set = new HashSet<>();

        // while (right < s.length()) {
        //     if (!set.contains(s.charAt(right))) {
        //         set.add(s.charAt(right));
        //         maxLength = Math.max(maxLength, right - left + 1);
        //         right++;
        //     } else {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        // }
        // return maxLength;
        // int[] map = new int[256];
        // Arrays.fill(map, -1);
        // int left = 0; int right = 0; int Length = 0;
        // while(right < s.length()){
        //     char ch = s.charAt(right);

        //     if(map[ch] != -1){
        //         left = Math.max(map[ch] + 1, left);
        //     }
        //     map[ch] = right;

        //     Length = Math.max(Length, right - left + 1);

        //     right++;;
        // }
        // return Length;

        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        while(right < n) {
            boolean dup = false;
            for(int i = left; i < right; i++) {
                if(s.charAt(i) == s.charAt(right)) {
                    dup = true;
                    break;
                }
            }
            if(dup) { left++;}
            else{
                int len = (right - left) + 1;
                maxLen = Math.max(maxLen, len);
                right++;
            }
        }
        return maxLen;
    }
}