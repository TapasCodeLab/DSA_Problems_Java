package org.scaler.dsa_problems_java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_Easy_2206_Divide_Array_Into_Equal_Pairs {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            if(entry.getValue()%2==1){
                return false;
            }
        }
        return true;
    }
}
