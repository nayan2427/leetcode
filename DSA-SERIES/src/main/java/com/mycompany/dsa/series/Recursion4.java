/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.series;

/**
 *
 * @author nayan_tea8t0d
 */
public class Recursion4 {
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        int fac = factorial(n-1);
        return n * fac; 
    }
    public static void main(String [] args){
        int n = 5;
        System.out.println(factorial(n));
    }
}
