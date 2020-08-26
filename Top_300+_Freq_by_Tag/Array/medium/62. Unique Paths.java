//https://leetcode.com/problems/unique-paths/discuss/22980/Clean-and-simple-DP-java
//https://github.com/azl397985856/leetcode/blob/master/problems/62.unique-paths.md
//https://www.youtube.com/watch?v=fmpP5Ll0Azc&feature=youtu.be

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0||j==0){
                    grid[i][j]=1;
                }
                else{
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
                }
            }
        }
        return grid[m-1][n-1];
    }
}

