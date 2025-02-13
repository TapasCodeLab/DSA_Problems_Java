package org.scaler.dsa_problems_java.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Leetcode_3066_Minimum_Operations_to_Exceed_Threshold_Value_IITest {
    Leetcode_3066_Minimum_Operations_to_Exceed_Threshold_Value_II solution = new Leetcode_3066_Minimum_Operations_to_Exceed_Threshold_Value_II();

//    @Test
//    public void Testcase1(){
//        assertEquals(2, solution.minOperations(new int[] {2,11,10,1,3},10));
//    }
//
//    @Test
//    public void Testcase2(){
//        assertEquals(4, solution.minOperations(new int[] {1,1,2,4,9},20));
//    }

    @Test
    public void Testcase3(){
        assertEquals(2, solution.minOperations(new int[] {1000000000,999999999,1000000000,999999999,1000000000,999999999},1000000000));
    }

}
