package org.scaler.dsa_problems_java.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Leetcode_1079_Letter_Tile_PossibilitiesTest {

    Leetcode_1079_Letter_Tile_Possibilities solution = new Leetcode_1079_Letter_Tile_Possibilities();

    @Test
    public void Testcase1(){
        assertEquals(8,solution.numTilePossibilities("AAB"));
    }

    @Test
    public void Testcase2(){
        assertEquals(188,solution.numTilePossibilities("AAABBC"));
    }

    @Test
    public void Testcase3(){
        assertEquals(1,solution.numTilePossibilities("V"));
    }

}
