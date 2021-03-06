//https://leetcode.com/problems/island-perimeter/discuss/95001/clear-and-easy-java-solution
//loop over the matrix and count the number of islands;
//if the current dot is an island, count if it has any right neighbour or down neighbour;
//the result is islands * 4 - neighbours * 2

class Solution {
    public int islandPerimeter(int[][] grid) {
        int island = 0, neighbour = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    island++; // count islands
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbour++; // count down neighbours
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbour++; // count right neighbours
                }
            }
        }

        return island * 4 - neighbour * 2;
    }
}




