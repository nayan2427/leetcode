package com.mycompany.dsa.series;

public class advProblem2 {
    public static int Pathtiles(int n, int m) {
        if(n < m) return 1;
        if(n == m) return 2;
        return Pathtiles(n - 1, m) + Pathtiles(n - m, m);
    }
    public static void main(String [] args) {
        int m = 4;
        int n = 2;
        System.out.println(Pathtiles(m, n));
    }
}
