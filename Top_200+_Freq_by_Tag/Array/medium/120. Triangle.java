//https://leetcode.com/problems/triangle/discuss/38724/7-lines-neat-Java-Solution
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size() + 1];
        for(int i = triangle.size()-1; i >= 0; i--){
            for(int j = 0; j < triangle.get(i).size(); j++){
                A[j] = Math.min(A[j], A[j + 1]) + triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}