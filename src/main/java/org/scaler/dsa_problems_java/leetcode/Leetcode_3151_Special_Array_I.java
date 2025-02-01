package org.scaler.dsa_problems_java.leetcode;

public class Leetcode_3151_Special_Array_I {

    public static boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]%2+nums[i+1]%2!=1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr1 = {1};
        System.out.println(isArraySpecial(arr1));
        int [] arr2 = {2,1,4};
        System.out.println(isArraySpecial(arr2));
        int [] arr3 = {4,3,1,6};
        System.out.println(isArraySpecial(arr3));
    }

}
