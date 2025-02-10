package org.scaler.dsa_problems_java.leetcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Leetcode_2364_Count_Number_of_Bad_PairsTest {

    Leetcode_2364_Count_Number_of_Bad_Pairs solution = new Leetcode_2364_Count_Number_of_Bad_Pairs();

    @Test
    public void testcase1(){
        assertEquals(0, solution.countBadPairs(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testcase2(){
        assertEquals(5, solution.countBadPairs(new int[]{4,1,3,3}));
    }

}
