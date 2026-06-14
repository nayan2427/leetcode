package com.mycompany.dsa.series;

import java.util.HashSet;

public class Problem7 {
    public static void subsequences(int idx, String str, String NewString, HashSet<String> set) {
        if (str.length() == idx) {
            if (set.contains(NewString)) {
                return;
            }
            else {
                set.add(NewString);
                System.out.println(NewString);
                return;
            }   
        }

        char currentChar = str.charAt(idx);

        subsequences(idx + 1, str, NewString + currentChar, set);

        subsequences(idx + 1, str, NewString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        subsequences(0, "aaa", "", set1);
        System.out.println();
        subsequences(0, "abc", "", set2);
        System.out.println();
    }
}
