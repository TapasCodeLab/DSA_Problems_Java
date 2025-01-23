package org.scaler.dsa_problems_java.leetcode;

import java.util.List;
import java.util.stream.IntStream;

public class Leetcode_1267_Count_Servers_that_Communicate {
    public static int countServers(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];

        for(int r=0; r< grid.length; r++){
            for(int c=0; c< grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    row[r]++;
                    col[c]++;
                }
            }
        }

        int res = 0;
        for(int r=0; r< grid.length; r++){
            for(int c=0; c< grid[0].length; c++) {
                if (grid[r][c] == 1 && (row[r]>1 || col[c]>1)) {
                    res++;
                }
            }
        }

    return res;

    }

    public static void main(String[] args){
        System.out.println(countServers(new int[][] {{1,0},{0,1}})); //0
        System.out.println(countServers(new int[][] {{1,0},{1,1}})); //3
        System.out.println(countServers(new int[][] {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}})); //4
        System.out.println(countServers(new int[][] {{1,1,1,0},{0,0,0,0},{0,0,0,0},{0,0,0,1}})); //3
        System.out.println(countServers(new int[][] {{0,0,1,0},{0,0,0,0},{0,0,0,0},{1,0,1,0}})); //3
    }




}
