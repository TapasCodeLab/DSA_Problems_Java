package org.scaler.dsa_problems_java.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Leetcode_Easy_2206_Divide_Array_Into_Equal_PairsTest {

    Leetcode_Easy_2206_Divide_Array_Into_Equal_Pairs solution = new Leetcode_Easy_2206_Divide_Array_Into_Equal_Pairs();

    @Test
    public void Testcase1(){
        assertTrue(solution.divideArray(new int[] {3, 2, 3, 2, 2, 2}));
    }

    @Test
    public void Testcase2(){
        assertFalse(solution.divideArray(new int[]{1,2,3,4}));
    }

}
