package org.scaler.dsa_problems_java.leetcode.Leetcode_2349_Design_a_Number_Container_System;

import java.util.HashMap;
import java.util.PriorityQueue;

public class NumberContainers {
    private HashMap<Integer,Integer> index_map;
    private HashMap<Integer, PriorityQueue<Integer>> data_map;

    public NumberContainers() {
        index_map = new HashMap<>();
        data_map = new HashMap<>();
    }

    public void change(int index, int number) {
        index_map.put(index,number);
        if(!data_map.containsKey(number)){
            data_map.put(number, new PriorityQueue<>());
        }
        data_map.get(number).add(index);
    }

    public int find(int number) {
        if(data_map.containsKey(number)){
            while(!data_map.get(number).isEmpty()){
                if(index_map.get(data_map.get(number).peek())==number){
                    return data_map.get(number).peek();
                }
                data_map.get(number).poll();
            }
        }
        return -1;
    }
}
