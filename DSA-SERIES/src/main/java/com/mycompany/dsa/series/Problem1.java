package com.mycompany.dsa.series;

public class Problem1 {

    static int move = 0;

    public static void TowerofHanoi(int n, String A, String B, String C) {

        if (n == 1) {
            move++;
            System.out.println("Move disk 1 from " + A + " to " + C);
            return;
        }

        TowerofHanoi(n - 1, A, C, B);

        move++;
        System.out.println("Move disk " + n + " from " + A + " to " + C);

        TowerofHanoi(n - 1, B, A, C);
    }

    public static void main(String[] args) {

        int n = 3;

        TowerofHanoi(n, "A", "B", "C");

        System.out.println("Total number of moves = " + move);
    }
}