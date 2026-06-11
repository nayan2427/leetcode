package com.mycompany.dsa.series;

public class Problem2 {
    public static void RevString(String str, int i){
        if( i == str.length()) return;
        
        RevString(str, i + 1);
        System.out.print(" " +str.charAt(i));
    }
    public static void main(String [] args){
        RevString("hello", 0);
        System.out.println();
        RevString("nayan", 0);;
        System.out.println();
    }
}
 