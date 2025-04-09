package org.scaler.dsa_problems_java.leetcode.Leetcode_Easy_3375_Minimum_Operations_to_Make_Array_Values_Equal_to_K;
import java.util.HashSet;

public class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums){
            if(n<k){
                return -1;
            }else if(n>k){
                hs.add(n);
            }
        }
        return hs.size();
    }
}
