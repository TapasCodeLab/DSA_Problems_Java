package org.scaler.dsa_problems_java.leetcode;

import java.util.HashMap;

public class Leetcode_3160_Find_the_Number_of_Distinct_Colors_Among_the_Balls {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> ball_color = new HashMap<>();
        HashMap<Integer, Integer> color_count = new HashMap<>();
        int distinct = 0;
        int [] result = new int[queries.length];

        for(int i=0; i<queries.length; i++){
            int ball = queries[i][0];
            int new_color = queries[i][1];
            if(ball_color.containsKey(ball)){
                int old_color = ball_color.get(ball);
                color_count.put(old_color, color_count.get(old_color)-1);
                if(color_count.get(old_color)==0){
                    color_count.remove(old_color);
                    distinct--;
                }
            }
            ball_color.put(ball, new_color);
            if(color_count.containsKey(new_color)){
                color_count.put(new_color, color_count.get(new_color)+1);
            } else {
                color_count.put(new_color, 1);
                distinct++;
            }
            result[i] = distinct;
        }
        return result;
    }

}
