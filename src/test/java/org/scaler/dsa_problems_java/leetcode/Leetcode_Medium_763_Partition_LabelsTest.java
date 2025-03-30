package org.scaler.dsa_problems_java.leetcode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Leetcode_Medium_763_Partition_LabelsTest {
    Leetcode_Medium_763_Partition_Labels solution = new Leetcode_Medium_763_Partition_Labels();

    @Test
    public void Testcase1(){
        assertEquals(solution.partitionLabels("ababcbacadefegdehijhklij"), Arrays.asList(9, 7, 8));
    }

    @Test
    public void Testcase2(){
        assertEquals(solution.partitionLabels("eccbbbbdec"),Arrays.asList(10));
    }

    @Test
    public void Testcase3(){
        assertEquals(solution.partitionLabels("ababababcddeefe"),Arrays.asList(8,1,2,4));
    }

}
