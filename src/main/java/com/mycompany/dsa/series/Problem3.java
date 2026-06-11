/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.series;

/**
 *
 * @author nayan_tea8t0d
 */
public class Problem3 {
     public static int first = -1;
     public static   int last = -1;
    public static void Occurence(String str, int i, char element){
        if(i == str.length()){
            System.out.println(first);
            System.out.println(last);
            return; 
        }
       char cur = str.charAt(i);
        if(cur == element){
            if(first == -1){
                first = i;
            }
                last = i;
        }
        Occurence(str, i + 1, element);
    }
    public static void main(String [] args){
        Occurence("abarkeajhhkajeh", 0, 'a');
    }
    
}
