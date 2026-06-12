package com.mycompany.dsa.series;

public class Problem5 {
    public static void moveX(String str, int idx, int count, String newString){
        if(str.length() == idx){
            for(int i=0; i<count; i++){
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        if(curr == 'x'){
            count++;
            moveX(str, idx+1, count, newString);
        }
        else{
            newString += curr;
            moveX(str, idx+1, count, newString);
        }
    }
    public static void main(String [] args){
        moveX("axbcxxd", 0, 0, "");
        moveX("axbxxvcxcxxd", 0, 0, "");
    }
}
