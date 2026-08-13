class Solution {
    public double myPow(double x, int n) {
        // long N = n;

        // if (N < 0) {
        //     x = 1 / x;
        //     N = -N;
        // }

        // return power(x, N);
        long nn = n;
        double ans = 1.0;

        if (nn < 0) {
            nn = -nn;
        }

        while (nn > 0) {

            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }

        if (n < 0) {
            ans = 1.0 / ans;
        }

        return ans;
    }

    // private double power(double x, long n) {
    //     if (n == 0)
    //         return 1;

    //     double half = power(x, n / 2);

    //     if (n % 2 == 0) {
    //         return half * half;
    //     }

    //     return half * half * x;
    // }
}