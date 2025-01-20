package org.scaler.dsa_problems_java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode_2661_First_Completely_Painted_Row_or_Column {

    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int lenr = mat.length;
        int lenc = mat[0].length;
        HashMap<Integer, Integer> dr = new HashMap<>();
        HashMap<Integer, Integer> dc = new HashMap<>();
        HashMap<Integer, Integer[]> d = new HashMap<>();
        for(int r=0; r<lenr;r++){
            for(int c=0; c<lenc; c++){
                d.put(mat[r][c], new Integer[]{r, c});
            }
        }

        for(int i=0; i<arr.length; i++){
            Integer[] a = d.get(arr[i]);
            if(dr.containsKey(a[0])){
                dr.put(a[0], dr.get(a[0])+1);
            } else {dr.put(a[0],1);}
            if(dc.containsKey(a[1])){
                dc.put(a[1], dc.get(a[1])+1);
            } else{dc.put(a[1], 1);}
            if(dr.get(a[0])==lenc){return i;}
            if(dc.get(a[1])==lenr){return i;}
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        int[][] mat = {{1,4},{2,3}};
        System.out.println(firstCompleteIndex(arr,mat));
    }

}
