class Solution {
    public int strStr(String haystack, String needle) {
          if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j ;
            for (j = 0; j < needle.length(); j++) {
                char[] ch1 = haystack.toCharArray();
                char[] ch2 = needle.toCharArray();
                if (ch1[i + j] != ch2[j]) {
                    break;
                }
            }
             if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}