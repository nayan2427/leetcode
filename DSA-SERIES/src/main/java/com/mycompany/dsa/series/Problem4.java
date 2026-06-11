/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa.series;

/**
 *
 * @author nayan_tea8t0d
 */
public class Problem4 {
    public static boolean isSorted(int[] nums,int i){
        
        if(i == nums.length){
            return true;
        }
        if(nums[i-1] > nums[i]){
            return false;
        }
        return isSorted(nums,i+1);
    }
    public static void main(String [] args){
        int [] nums1 = {1,2,3,4,5};
        int [] nums2 = {1,3,2,4,5};
        System.out.println(isSorted(nums1,1));
        System.out.println(isSorted(nums2,1));
    }
}
