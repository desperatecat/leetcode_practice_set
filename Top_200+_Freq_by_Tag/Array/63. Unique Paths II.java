//https://github.com/grandyang/leetcode/issues/63

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid[0] == null || obstacleGrid[0][0] == 1){
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] grid = new int[m+1][n+1];
        grid[0][1] = 1; //dp[1][1] = dp[0][1] + dp[1][0] = 1，which means dp[0][1] or dp[1][0] is 1 

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(obstacleGrid[i-1][j-1]!=0) continue; //avoid obstacle
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }
        return grid[m][n];

    }
}
