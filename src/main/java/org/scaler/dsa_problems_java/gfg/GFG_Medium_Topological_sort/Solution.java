package org.scaler.dsa_problems_java.gfg.GFG_Medium_Topological_sort;

import java.util.*;

public class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int [] indegree = new int[V];
        HashMap<Integer,ArrayList<Integer>> adj = new HashMap<>();
        for(int i=0;i<V;++i){
            adj.put(i,new ArrayList<>());
        }

        for(int[] edge: edges){
            indegree[edge[1]] += 1;
            adj.get(edge[0]).add(edge[1]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<V;++i){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            for(int nxt:adj.get(node)){
                indegree[nxt] -= 1;
                if(indegree[nxt] == 0){
                    queue.add(nxt);
                }
            }
        }

        return res;
    }

}
