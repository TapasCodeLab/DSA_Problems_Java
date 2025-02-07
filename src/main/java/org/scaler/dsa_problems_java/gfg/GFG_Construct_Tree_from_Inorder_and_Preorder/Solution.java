package org.scaler.dsa_problems_java.gfg.GFG_Construct_Tree_from_Inorder_and_Preorder;

import java.util.HashMap;

public class Solution {

    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public Node helper(int in_start,int in_end,int pre_start,int pre_end,int inorder[], int preorder[]){
        if(in_end<in_start){
            return null;
        }
        Node node = new Node(preorder[pre_start]);
        int index = hashMap.get(preorder[pre_start]);
        node.left = helper(in_start, index-1,pre_start+1,pre_start+index-in_start,inorder,preorder);
        node.right = helper(index+1,in_end,pre_start+index-in_start+1, pre_end,inorder, preorder);
        return node;
    }

    public Node buildTree(int inorder[], int preorder[]) {
        // code here
        for(int i=0; i<inorder.length; i++){
            hashMap.put(inorder[i],i);
        }
        return helper(0,inorder.length-1,0, preorder.length-1, inorder, preorder);
    }
}
