package org.scaler.dsa_problems_java.leetcode;

public class Leetcode_200_Number_of_Islands {
    private int rows;
    private int cols;
    private char[][] visited;
    private int res = 0;

    private boolean inGrid(int row, int col){
        return (0<=row && row<rows && 0<=col && col<cols);
    }

    private void dfs(int row, int col){
        if(visited[row][col]=='1'){
            visited[row][col]='0';
            int[][] directions = {{row + 1, col}, {row - 1, col}, {row, col + 1}, {row, col - 1}};
            for (int[] dir : directions) {
                if(inGrid(dir[0],dir[1]) && visited[dir[0]][dir[1]]=='1'){
                    dfs(dir[0],dir[1]);
                }
            }
        }
    }


    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        visited = new char[rows][cols];
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                visited[row][col] = grid[row][col];
            }
        }

        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                if(visited[row][col] == '1'){
                    res += 1;
                    dfs(row,col);
                }
            }
        }
        return res;
    }
}
