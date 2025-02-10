package org.scaler.dsa_problems_java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_2364_Count_Number_of_Bad_Pairs {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i] - i, freq.getOrDefault(nums[i] - i, 0) + 1);
        }

        long total_pair = ((long) nums.length * (nums.length - 1)) / 2;
        long good_pair = 0;

        for (Map.Entry<Integer, Integer> map : freq.entrySet()) {
            good_pair = good_pair + (((long) map.getValue() * (map.getValue() - 1) / 2));
        }

        return total_pair - good_pair;
    }
}
