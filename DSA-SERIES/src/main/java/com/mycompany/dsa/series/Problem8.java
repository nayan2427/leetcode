package com.mycompany.dsa.series;

public class Problem8 {
    public static String[] keypad = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void printKeypad(String str, String ans, int idx){
       if(idx == str.length()){
              System.out.println(ans);
              return;
       }
        char digit = str.charAt(idx);
        String mapping = keypad[digit - '0'];

        for(int i = 0; i < mapping.length(); i++){
            printKeypad(str, ans + mapping.charAt(i), idx + 1);
        }
    }
    public static void main(String[] args) {
        printKeypad("32", "",0);
    }

}
