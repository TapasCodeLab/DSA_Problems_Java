package org.scaler.dsa_problems_java.leetcode;

public class Leetcode_3174_Clear_Digits {

    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int index = -1;

        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if('a'<=ch && ch<='z'){
                sb.append(ch);
                index++;
            } else{
                sb.deleteCharAt(index);
                index--;
            }
        }

        return sb.toString();
    }
}
