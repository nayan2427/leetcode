package com.mycompany.dsa.series;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is prime or not: ");
        int n = sc.nextInt();

        int c = 0;

        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }
        }

        if (c == 2) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}
