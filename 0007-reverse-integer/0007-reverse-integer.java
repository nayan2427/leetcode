class Solution {
    public int reverse(int x) {
        //     long revs = 0;
        //     while(x != 0) {
        //         int i = x % 10;
        //         revs = revs * 10 + i;
        //         x = x / 10;
        //     }

        //     if(revs > Integer.MAX_VALUE || revs < Integer.MIN_VALUE) {
        //         return 0;
        //     }

        //     return (int) revs;
        // }
        long rev = 0;
        while (x != 0) {
            int y = x % 10;
            rev = rev * 10 + y;
            x = x / 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}