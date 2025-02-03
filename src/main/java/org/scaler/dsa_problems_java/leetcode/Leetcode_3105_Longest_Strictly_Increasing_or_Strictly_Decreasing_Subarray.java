package org.scaler.dsa_problems_java.leetcode;

public class Leetcode_3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {
    public static int longestMonotonicSubarray(int[] nums) {
        int inc=1, dec=1, res=1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                inc++;
                res =Math.max(res,inc);
            } else{ inc=1;}
            if(nums[i+1]<nums[i]){
                dec++;
                res =Math.max(res,dec);
            } else{ dec=1;}
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2};
        System.out.println(longestMonotonicSubarray(nums));
    }

}
