package com.mycompany.dsa.series;

public class advProblem3 {
    public static int callGuest(int n ) {

        if(n <= 1) return 1;
        return callGuest(n - 1) + (n - 1) * callGuest(n - 2);
    }
    public static void main (String [] args) {
        System.out.println(callGuest(4));
        System.out.println(callGuest(5));
    }
}
