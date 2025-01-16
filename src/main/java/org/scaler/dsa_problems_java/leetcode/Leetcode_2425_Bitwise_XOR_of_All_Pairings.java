package org.scaler.dsa_problems_java.leetcode;

public class Leetcode_2425_Bitwise_XOR_of_All_Pairings {

    public static int xorAllNums(int[] nums1, int[] nums2) {
        int ans = 0;
        if(nums2.length%2!=0){
            for(int n:nums1){
                ans=ans^n;
            }
        }
        if(nums1.length%2!=0){
            for(int n:nums2){
                ans=ans^n;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,1,3};
        int[] nums2 = {10,2,5,0};
        System.out.println(xorAllNums(nums1,nums2));
    }
}
