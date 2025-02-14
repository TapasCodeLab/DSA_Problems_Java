package org.scaler.dsa_problems_java.leetcode.Leetcode_1352_Product_of_the_Last_K_Numbers;

import java.util.ArrayList;

public class ProductOfNumbers {
    private int product_so_far;
    private ArrayList<Integer> pref_mul;

    public ProductOfNumbers() {
        this.pref_mul = new ArrayList<>();
        this.product_so_far = 1;
    }

    public void add(int num) {
        if(num != 0){
            this.product_so_far = this.product_so_far * num;
            this.pref_mul.add(this.product_so_far);
        } else{
            this.product_so_far = 1;
            this.pref_mul = new ArrayList<>();
        }
    }

    public int getProduct(int k) {
        int n = this.pref_mul.size();
        if(k==n){
            return this.pref_mul.get(k-1);
        }
        if(k>n){
            return 0;
        }
        else{
            return this.pref_mul.get(n-1)/this.pref_mul.get(n-k-1);
        }
    }

}
