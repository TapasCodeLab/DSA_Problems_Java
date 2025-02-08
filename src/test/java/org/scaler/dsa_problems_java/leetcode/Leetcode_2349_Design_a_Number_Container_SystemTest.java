package org.scaler.dsa_problems_java.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.scaler.dsa_problems_java.leetcode.Leetcode_2349_Design_a_Number_Container_System.NumberContainers;

import java.util.ArrayList;

public class Leetcode_2349_Design_a_Number_Container_SystemTest {

    @Test
    void Testcase_1(){
        NumberContainers nc = new NumberContainers();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(nc.find(10));
        nc.change(2,10);
        nc.change(1,10);
        nc.change(3,10);
        nc.change(5,10);
        result.add(nc.find(10));
        nc.change(1,20);
        result.add(nc.find(10));
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(1);
        arr.add(2);
        assert(arr.equals(result));
    }
}
