//https://leetcode.com/problems/house-robber-ii/discuss/59934/Simple-AC-solution-in-Java-in-O(n)-with-explanation
class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;        
        int exclude_1st = rob_helper(nums, 1, nums.length-1);
        int include_1st = nums[0] + rob_helper(nums, 2, nums.length-2);
        return Math.max(include_1st, exclude_1st);        
    }

    public int rob_helper(int[] nums, int start, int end) {     
        int pre_i_2 = 0;
        int pre_i_1 = 0;
        for(int i=start; i<=end; i++)
        {
            int cur = Math.max(nums[i] + pre_i_2, pre_i_1);
            int temp = pre_i_1;
            pre_i_1 = cur;
            pre_i_2 = temp;
        }        
        return pre_i_1;
    }
}