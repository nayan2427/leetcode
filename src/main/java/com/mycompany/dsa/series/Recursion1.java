package com.mycompany.dsa.series;

public class Recursion1 {
    public static void printNum(int n){
     System.out.println(n);
     if(n > 0){
     printNum(n-1);
     }
}
    public static void main(String [] args){
    int n = 5;
    printNum(n);
    }
}
