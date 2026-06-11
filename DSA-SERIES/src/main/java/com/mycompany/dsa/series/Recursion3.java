/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.series;

/**
 *
 * @author nayan_tea8t0d
 */
public class Recursion3 {
    public static void Sum(int i, int n, int sum){
    if(i == n){
        sum += i;
        System.out.print(sum);
        return;
    }
    
        sum += i;
        Sum(i+1, n, sum);
    }
    public static void main(String [] args){
        Sum(1,5,0);
    }
    
}
