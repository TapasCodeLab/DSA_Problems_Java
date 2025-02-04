package org.scaler.dsa_problems_java.gfg.GFG_Diameter_of_a_Binary_Tree;
import java.io.*;
import java.util.*;

public class Solution {
    public static int[] helper(Node node){
        if(node==null){
            return new int[] {0,0};
        } else{
            int[] left = helper(node.left);
            int[] right = helper(node.right);
            return new int[] {Math.max(Math.max(left[0], right[0]),left[1]+right[1]), 1+Math.max(left[1],right[1])};
        }
    }

    int diameter(Node root) {
        // Your code here
        int[] res = helper(root);
        return res[0];
    }
}
