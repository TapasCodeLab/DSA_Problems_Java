package org.scaler.dsa_problems_java.leetcode.Leetcode_Easy_3375_Minimum_Operations_to_Make_Array_Values_Equal_to_K;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSolution {

    Solution solution = new Solution();

    @Test
    public void Testcase1(){
        assertEquals(2, solution.minOperations(new int[] {5,2,5,4,5}, 2));
    }

    @Test
    public void Testcase2(){
        assertEquals(-1, solution.minOperations(new int[] {2,1,2}, 2));
    }

    @Test
    public void Testcase3(){
        assertEquals(4, solution.minOperations(new int[] {9,7,5,3}, 1));
    }

}
