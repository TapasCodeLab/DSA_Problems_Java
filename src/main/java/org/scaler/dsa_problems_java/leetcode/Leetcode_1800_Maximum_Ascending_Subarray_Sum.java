package org.scaler.dsa_problems_java.leetcode;

public class Leetcode_1800_Maximum_Ascending_Subarray_Sum {
    public static int maxAscendingSum(int[] nums) {
        int prev = 0, total=0, res=0;
        for(int n:nums){
            if(n>prev){
                total += n;
            } else {
                total=n;
            }
            prev=n;
            res = Math.max(res,total);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num1 = {10,20,30,5,10,50};
        System.out.println(maxAscendingSum(num1));
    }
}
