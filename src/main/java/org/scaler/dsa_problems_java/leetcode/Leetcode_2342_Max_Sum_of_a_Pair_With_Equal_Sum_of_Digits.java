package org.scaler.dsa_problems_java.leetcode;

import java.util.HashMap;

public class Leetcode_2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits {

    private int sumDigit(int number){
        int total = 0;
        while(number>0){
            total += number%10;
            number = number/10;
        }
        return total;
    }

    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer[]> freq = new HashMap<>();
        int ans = -1;
        for(int num:nums){
            int sum = sumDigit(num);
            if(freq.containsKey(sum)){
                if(num>freq.get(sum)[0]){
                    freq.put(sum,new Integer[] {num, freq.get(sum)[0]});
                } else if(num>freq.get(sum)[1]){
                    freq.put(sum,new Integer[] {freq.get(sum)[0], num});
                }
                ans = Math.max(ans, freq.get(sum)[0]+freq.get(sum)[1]);
            }else {
                freq.put(sum, new Integer[] {num,-1});
            }
        }
        return ans;
    }
}
