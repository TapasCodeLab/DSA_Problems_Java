package org.scaler.dsa_problems_java.gfg.GFG_Level_order_traversal;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;


public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        ArrayList <ArrayList <Integer>> res = new ArrayList<>();
        Node node;
        while(!queue.isEmpty()){
            ArrayList <Integer> temp = new ArrayList<>();
            for(int i=0; i <queue.size(); i++){
                node = queue.remove();
                temp.add(node.data);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
