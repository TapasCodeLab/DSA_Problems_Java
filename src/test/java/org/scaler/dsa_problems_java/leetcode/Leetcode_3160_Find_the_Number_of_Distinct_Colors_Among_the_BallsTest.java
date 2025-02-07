package org.scaler.dsa_problems_java.leetcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Leetcode_3160_Find_the_Number_of_Distinct_Colors_Among_the_BallsTest {

    @Test
    public void testcase_1(){
        Leetcode_3160_Find_the_Number_of_Distinct_Colors_Among_the_Balls solution = new Leetcode_3160_Find_the_Number_of_Distinct_Colors_Among_the_Balls();
        int [][] queries = {{1,4},{2,5},{1,3},{3,4}};
        assertArrayEquals(new int[]{1, 2, 2, 3},solution.queryResults(4, queries));
    }

    @Test
    public void testcase_2(){
        Leetcode_3160_Find_the_Number_of_Distinct_Colors_Among_the_Balls solution = new Leetcode_3160_Find_the_Number_of_Distinct_Colors_Among_the_Balls();
        int [][] queries = {{0,1},{1,2},{2,2},{3,4},{4,5}};
        assertArrayEquals(new int[]{1,2,2,3,4},solution.queryResults(4, queries));
    }

}
