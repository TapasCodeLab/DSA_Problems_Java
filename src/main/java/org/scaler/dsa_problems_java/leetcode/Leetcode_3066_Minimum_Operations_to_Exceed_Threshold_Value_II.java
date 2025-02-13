package org.scaler.dsa_problems_java.leetcode;

import java.util.PriorityQueue;

public class Leetcode_3066_Minimum_Operations_to_Exceed_Threshold_Value_II {
    public int minOperations(int[] nums, int k) {
        int result = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();
        int size =0;

        // add all elements to queue
        for(int num:nums){
            queue.add((long) num);
            size++;
        }

        while(size>=2){
            if(queue.peek()>=k){break;}
            Long x = queue.poll();
            System.out.println(x);
            Long y = queue.poll();
            System.out.println(y);
            System.out.println(2*x+y);
            queue.add(2*x+y);
            size--;
            result++;
        }

        return result;
    }
}
