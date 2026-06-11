/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.series;

/**
 *
 * @author nayan_tea8t0d
 */
public class Recursion5 {
    public static void Fibonacci(int n, int a,int b){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        Fibonacci(n - 1,b,c );
    }
    public static void main(String [] args){
        int n = 7;
        int a = 0 , b = 1;
        System.out.println(a);
        System.out.println(b);
        Fibonacci(n - 2, a , b);
        
    }
    
}
