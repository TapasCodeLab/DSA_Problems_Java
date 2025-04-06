package org.scaler.dsa_problems_java.gfg.GFG_Medium_Topological_sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class TestSolution {

    //Solution solution = new Solution();

    @Test
    public void Testcase1(){
        int V = 4;
        int[][] edges = {{3, 0},{1, 0},{2, 0}};
        assertEquals(Arrays.asList(1,2,3,0), Solution.topoSort(V,edges));
    }

    @Test
    public void Testcase2(){
        int V = 6;
        int[][] edges = {{1, 3}, {2, 3}, {4, 1}, {4, 0}, {5, 0}, {5,2}};
        assertEquals(Arrays.asList(4, 5, 1, 0, 2, 3), Solution.topoSort(V,edges));
    }
}
