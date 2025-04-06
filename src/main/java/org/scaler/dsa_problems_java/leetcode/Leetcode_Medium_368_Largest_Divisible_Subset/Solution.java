package org.scaler.dsa_problems_java.leetcode.Leetcode_Medium_368_Largest_Divisible_Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        ArrayList<Integer> dp = new ArrayList<>();
        ArrayList<Integer> parent = new ArrayList<>();

        for(int i=0; i<nums.length; ++i){
            dp.add(1);
            parent.add(i);
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length;++i){
            for(int j=0;j<i;++j){
                if(nums[i]%nums[j] == 0 & dp.get(j)+1>dp.get(i)){
                    dp.add(i,dp.get(j)+1);
                    parent.add(i,j);
                }
            }
        }

        int end = dp.indexOf(dp.stream().max(Integer::compareTo).get());
        while(parent.get(end) != end){
            res.add(nums[end]);
            end = parent.get(end);
        }
        res.add(nums[end]);
        Collections.reverse(res);
        return res;
    }
}
