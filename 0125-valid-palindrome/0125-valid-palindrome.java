class Solution {
    public String rev(String s) {
        String revs = "";
        int r = s.length() - 1;

        while (r >= 0) {
            revs += s.charAt(r);
            r--;
        }

        return revs;
    }

    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");
        String rev = rev(str);
        return str.equals(rev);
    }
}
