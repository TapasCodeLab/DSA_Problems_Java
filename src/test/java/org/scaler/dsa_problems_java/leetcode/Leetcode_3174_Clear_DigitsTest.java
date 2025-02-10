package org.scaler.dsa_problems_java.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Leetcode_3174_Clear_DigitsTest {

    Leetcode_3174_Clear_Digits solution = new Leetcode_3174_Clear_Digits();

    @Test
    public void Testcase1(){
        assertEquals(solution.clearDigits("abc"),"abc");
    }

    @Test
    public void Testcase2(){
        assertEquals(solution.clearDigits("abc123"),"");
    }

    @Test
    public void Testcase3(){
        assertEquals(solution.clearDigits("abc12"),"a");
    }



}
