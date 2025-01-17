package org.scaler.dsa_problems_java.leetcode;

public class Leetcode_2683_Neighboring_Bitwise_XOR {

    public static boolean doesValidArrayExist(int[] derived) {
        int temp = 0;
        for(int d:derived){
            temp = temp ^ d;
        }
        return temp == 0;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,1,0,1,0};
        System.out.println(doesValidArrayExist(arr));
        int[] arr1 = {1,1,0,1,1,0,1,0,1,0};
        System.out.println(doesValidArrayExist(arr1));

    }
}
