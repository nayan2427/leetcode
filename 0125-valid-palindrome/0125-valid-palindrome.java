class Solution {
    // public String rev(String s) {
    //     String revs = "";
    //     int r = s.length() - 1;

    //     while (r >= 0) {
    //         revs += s.charAt(r);
    //         r--;
    //     }

    //     return revs;
    // }

    // public boolean isPalindrome(String s) {
    //     String str = s.toLowerCase();
    //     str = str.replaceAll("[^a-z0-9]", "");
    //     String rev = rev(str);
    //     return str.equals(rev);
    // }
        public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) !=
                Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
