package org.scaler.dsa_problems_java.leetcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.scaler.dsa_problems_java.leetcode.Leetcode_1352_Product_of_the_Last_K_Numbers.ProductOfNumbers;


public class Leetcode_1352_Product_of_the_Last_K_NumbersTest {

    @Test
    public void Testcase1(){
        ProductOfNumbers obj = new ProductOfNumbers();
        obj.add(3);
        obj.add(0);
        obj.add(2);
        obj.add(5);
        obj.add(4);
        assertEquals(20,obj.getProduct(2));
        assertEquals(40,obj.getProduct(3));
        assertEquals(0,obj.getProduct(4));
        obj.add(8);
        assertEquals(32,obj.getProduct(2));
    }

}
