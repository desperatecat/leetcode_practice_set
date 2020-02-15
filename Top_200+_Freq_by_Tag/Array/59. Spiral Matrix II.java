//https://leetcode.com/problems/spiral-matrix-ii/discuss/22292/Share-my-java-solution

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        if(n==0){
            return matrix;
        }

        int top = 0;    //top row
        int bottom = n-1;   //bottom row
        int left = 0;   //left column
        int right = n-1;    //right column
        int num = 1; //starts from the topleft element

        while(left<=right && top<=botton){
            for(int j = left; j <= right; j++){
                matrix[top][j] = num++;
            }
            top++;

            for(int i = top; i <= bottom; i++){
                matrix[i][right] = num++;
            }
            right--;

            for(int j = right; j >= left; j-- )}{
                matrix[bottom][j] = num++;
            }
            bottom--;

            for(int i=bottom; i >= top; i-- ){
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;

    }
