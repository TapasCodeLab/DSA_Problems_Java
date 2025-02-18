package org.scaler.dsa_problems_java.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GFG_k_largest_elements {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer a: arr){
            al.add(a);
        }
        Collections.sort(al, Collections.reverseOrder());
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<k; i++){
            res.add(al.get(i));
        }
        return res;
    }

}
