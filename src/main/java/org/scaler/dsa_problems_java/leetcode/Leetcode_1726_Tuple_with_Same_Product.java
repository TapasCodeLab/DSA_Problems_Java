package org.scaler.dsa_problems_java.leetcode;

import java.math.BigInteger;
import java.util.HashMap;


public class Leetcode_1726_Tuple_with_Same_Product {

    private BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for(int i=2; i<=n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    private Integer ncr(Integer n, Integer r){
        return factorial(n).divide(factorial(n-r).multiply(factorial(r))).intValue();
    }

    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> products = new HashMap<>();
        for(int i=0;i< nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(products.containsKey(nums[i] * nums[j])){
                    products.put(nums[i] * nums[j], products.get(nums[i] * nums[j])+1);
                } else{
                    products.put(nums[i] * nums[j],1);
                }
            }
        }

        int res = 0;
        for(HashMap.Entry<Integer, Integer> entry: products.entrySet()){
            if(entry.getValue() >= 2){
                res = res + ncr(entry.getValue(), 2)*8;
            }
        }
        return res;
    }

}
