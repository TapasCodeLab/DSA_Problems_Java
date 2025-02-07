package org.scaler.dsa_problems_java.gfg.GFG_Inorder_Traversal;

import java.util.*;

public class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    private ArrayList<Integer> result = new ArrayList<>();

    private void helper(Node node){
        if(node == null){
            return;
        }
        helper(node.left);
        result.add(node.data);
        helper(node.right);
    }

    ArrayList<Integer> inOrder(Node root) {
        // Code
        helper(root);
        return result;

    }
}
