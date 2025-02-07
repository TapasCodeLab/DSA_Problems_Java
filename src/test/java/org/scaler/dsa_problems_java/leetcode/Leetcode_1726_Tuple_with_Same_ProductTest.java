package org.scaler.dsa_problems_java.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Leetcode_1726_Tuple_with_Same_ProductTest {

    @Test
    void success_testcase_1(){
        Leetcode_1726_Tuple_with_Same_Product solution = new Leetcode_1726_Tuple_with_Same_Product();
        int [] nums = {2,3,4,6};
        assertEquals(8, solution.tupleSameProduct(nums));
    }

    @Test
    void success_testcase_2(){
        Leetcode_1726_Tuple_with_Same_Product solution = new Leetcode_1726_Tuple_with_Same_Product();
        int [] nums = {1,2,4,5,10};
        assertEquals(16, solution.tupleSameProduct(nums));
    }

    @Test
    void success_testcase_3(){
        Leetcode_1726_Tuple_with_Same_Product solution = new Leetcode_1726_Tuple_with_Same_Product();
        int [] nums = {2,4,8,16,32,64,128,256,512,1024,2048,4096};
        assertEquals(760, solution.tupleSameProduct(nums));
    }

}
