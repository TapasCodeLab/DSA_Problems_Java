package org.scaler.dsa_problems_java.leetcode;

import java.sql.SQLOutput;

public class Leetcode_1790_Check_if_One_String_Swap_Can_Make_Strings_Equal {
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        } else if (s1.equals(s2)){
            return true;
        } else{
            int first=-1, second =-1, count=0;
            for(int i=0;i<s1.length();++i){
                if(s1.charAt(i)!=s2.charAt(i)){
                    count++;
                    if(first==-1){
                        first = i;
                    } else {second = i;}
                }
            }
            if(count!=2){
                return false;
            }
            return (s1.charAt(first)==s2.charAt(second) && s1.charAt(second)==s2.charAt(first));
        }
    }

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("abcdef", "abedcf"));
        System.out.println(areAlmostEqual("abcd","abcd"));
        System.out.println(areAlmostEqual("abcde","abcdf"));
        System.out.println(areAlmostEqual("abcd","dabc"));

    }

}
