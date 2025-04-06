package org.scaler.dsa_problems_java.leetcode.Leetcode_Medium_368_Largest_Divisible_Subset;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestSolution {

    Solution s = new Solution();

    @Test
    public void Testcase1(){
        assertEquals(Arrays.asList(1, 2), s.largestDivisibleSubset(new int[] {1, 2, 3}));
    }

    @Test
    public void Testcase2(){
        assertEquals(Arrays.asList(1,2,4,8), s.largestDivisibleSubset(new int[] {1,2,4,8}));
    }

    @Test
    public void Testcase3(){
        assertEquals(Arrays.asList(2,4,120), s.largestDivisibleSubset(new int[] {2, 5, 4, 3, 120}));
    }

    @Test
    public void Testcase4(){
        assertEquals(Arrays.asList(2,4,120), s.largestDivisibleSubset(new int[] {2, 5, 3, 120, 4}));
    }

    @Test
    public void Testcase5(){
        assertEquals(List.of(3), s.largestDivisibleSubset(new int[] {3}));
    }

    @Test
    public void Testcase6(){
        assertEquals(Arrays.asList(1,2,4,8), s.largestDivisibleSubset(new int[] {1,3,8,4,6,7,9,10,12,15,18,17,2,66,106,69,517}));
    }

}
