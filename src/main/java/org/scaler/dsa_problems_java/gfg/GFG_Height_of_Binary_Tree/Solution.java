package org.scaler.dsa_problems_java.gfg.GFG_Height_of_Binary_Tree;

public class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node==null){
            return 0;
        } else if(node.left==null && node.right==null){
            return 0;
        } else {
            return 1 + Math.max(height(node.left),height(node.right));
        }
    }
}
