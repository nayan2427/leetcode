/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.series;

/**
 *
 * @author nayan_tea8t0d
 */
public class Recursion2 {
    public static void printNum(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    
    public static void main(String [] args){
        int n = 1;
        printNum(n);
    }
}
