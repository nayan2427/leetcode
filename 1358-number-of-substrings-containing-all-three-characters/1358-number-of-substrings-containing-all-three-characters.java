class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] c = new int[3];

        int l = 0;
        int ans = 0;
        int unique = 0;

        for (int r = 0; r < n; r++) {
            int idx = s.charAt(r) - 'a';

            if (c[idx] == 0) {
                unique++;
            }
            c[idx]++;

            while (unique == 3) {
                ans += (n - r);

                int leftIdx = s.charAt(l) - 'a';
                c[leftIdx]--;

                if (c[leftIdx] == 0) {
                    unique--;
                }

                l++;
            }
        }

        return ans;
    }
}