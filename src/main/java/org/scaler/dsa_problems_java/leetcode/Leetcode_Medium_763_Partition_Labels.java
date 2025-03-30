package org.scaler.dsa_problems_java.leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode_Medium_763_Partition_Labels{

    public List<Integer> partitionLabels(String s) {

        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Character, Integer> total_freq = new HashMap<>();
        HashMap<Character, Integer> freq = new HashMap<>();
        Character ch;
        for(Integer i=0;i<s.length();i++){
            ch = s.charAt(i);
            total_freq.put(ch, total_freq.getOrDefault(ch,0)+1);
        }
        Integer start = 0;
        for(Integer i=0;i<s.length();i++){
            ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
            if(freq.get(ch) == total_freq.get(ch)){
                freq.remove(ch);
            }
            if(freq.isEmpty()){
                res.add(i-start+1);
                start = i+1;
            }
        }
        return res;
    }
}
