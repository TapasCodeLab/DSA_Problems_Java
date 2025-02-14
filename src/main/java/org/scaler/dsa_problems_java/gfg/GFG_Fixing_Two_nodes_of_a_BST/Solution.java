package org.scaler.dsa_problems_java.gfg.GFG_Fixing_Two_nodes_of_a_BST;

public class Solution {

    private Node prev_node = null;
    private int prev = 0;
    private Node first =null;
    private Node second = null;

    private void helper(Node node){
        if(node == null) return;
        helper(node.left);
        if(prev_node != null && prev > node.data){
            if(first == null){
                first = prev_node;
                second = node;
            } else{
                second = node;
            }
        }
        prev_node = node;
        prev = node.data;
        helper(node.right);
    }

    void correctBST(Node root) {
        // code here.
        helper(root);
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
    }
}
