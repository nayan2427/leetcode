
package com.mycompany.dsa.series;

/**
 *
 * @author nayan_tea8t0d
 */
public class Recursion6 {
    public static double power(int x, int n) {
    if (n == 0) return 1;
    if (x == 0) return 0;

    if (n < 0) {
        return 1.0 / power(x, -n);
    }

    double half = power(x, n / 2);

    if (n % 2 == 0)
        return half * half;
    else
        return half * half * x;
}
    public static void main(String [] args){
      System.out.println(power(-2, 8));
            System.out.println(power(-2, -2));
                  System.out.println(power(3, -5));

    }
}
