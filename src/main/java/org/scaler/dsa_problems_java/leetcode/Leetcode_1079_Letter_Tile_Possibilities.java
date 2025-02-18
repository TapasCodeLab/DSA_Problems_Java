package org.scaler.dsa_problems_java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leetcode_1079_Letter_Tile_Possibilities {
    private HashSet<String> res = new HashSet<>();

    private void backtrack(StringBuilder current, HashMap<Character, Integer> available, int length){
        if(current.length()==length){
            res.add(current.toString());
        }
        else{
            ArrayList<Character> candidates = new ArrayList<>();
            for(Map.Entry map: available.entrySet()){
                if((Integer) map.getValue()>0){
                    candidates.add((Character) map.getKey());
                }}
            for(Character candidate: candidates){
                current.append(candidate);
                available.put(candidate, available.get(candidate)-1);
                backtrack(current,available,length);
                available.put(candidate,available.getOrDefault(candidate,0)+1);
                current.deleteCharAt(current.length()-1);
            }

            }
    }

    public int numTilePossibilities(String tiles) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<tiles.length();i++){
            Character ch = tiles.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        for(int i=1; i<tiles.length()+1;i++){
            backtrack(new StringBuilder(),freq,i);
        }

        return res.size();
    }
}
