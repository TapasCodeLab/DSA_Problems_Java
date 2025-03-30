package org.scaler.dsa_problems_java.gfg;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GFG_Medium_Gas_StationTest {
    GFG_Medium_Gas_Station solution = new GFG_Medium_Gas_Station();

    @Test
    public void Testcase1(){
        assertEquals(2,solution.startStation(new int[]{4, 5, 7, 4}, new int[]{6, 6, 3, 5}));
    }

    @Test
    public void Testcase2(){
        assertEquals(3,solution.startStation(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void Testcase3(){
        assertEquals(-1, solution.startStation(new int[]{3, 9}, new int[]{7, 6}));
    }
}
