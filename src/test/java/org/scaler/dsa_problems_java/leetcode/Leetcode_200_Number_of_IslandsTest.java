package org.scaler.dsa_problems_java.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Leetcode_200_Number_of_IslandsTest {

    @Test
    void numIslands_Success_Case_1() {
        Leetcode_200_Number_of_Islands solution = new Leetcode_200_Number_of_Islands();
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, solution.numIslands(grid));
    }
    @Test
    void numIslands_Success_Case_2() {
        Leetcode_200_Number_of_Islands solution = new Leetcode_200_Number_of_Islands();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

}
