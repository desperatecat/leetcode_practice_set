//https://leetcode.com/problems/rotate-image/discuss/18872/A-common-method-to-rotate-the-image
//https://github.com/azl397985856/leetcode/blob/master/problems/48.rotate-image.md

class Solution {
    public void rotate(int[][] matrix) {
        int s = 0, e = matrix.length - 1;
        while(s<e){
            int[] temp = matrix[s];
            matrix[s] = matrix[e];
            matrix[e] = temp;
            s++;
            e--;
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}