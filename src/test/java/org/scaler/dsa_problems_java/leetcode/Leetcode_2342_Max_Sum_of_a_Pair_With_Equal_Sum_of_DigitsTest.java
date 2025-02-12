package org.scaler.dsa_problems_java.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Leetcode_2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_DigitsTest {
    Leetcode_2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits solution = new Leetcode_2342_Max_Sum_of_a_Pair_With_Equal_Sum_of_Digits();

    @Test
    public void Testcase1(){
        assertEquals(54, solution.maximumSum(new int[] {18,43,36,13,7}));
    }

    @Test
    public void Testcase2(){
        assertEquals(-1, solution.maximumSum(new int[] {10,12,19,14}));
    }

    @Test
    public void Testcase3(){
        assertEquals(12, solution.maximumSum(new int[] {4,6,10,6}));
    }

}