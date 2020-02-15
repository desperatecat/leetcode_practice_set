//https://github.com/grandyang/leetcode/issues/55
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;  //reach represents the fartest index that can be reached
        for(int i=0; i<n; i++){
            if(i>reach || reach>=n-1) break;
            reach = Math.max(reach, i+nums[i]);
            
        }
        return reach >=n-1;
    }
}