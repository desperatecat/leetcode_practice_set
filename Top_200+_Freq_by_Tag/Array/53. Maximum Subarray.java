//third solution of https://blog.csdn.net/m0_37925202/article/details/80816684

class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length==0) return 0;

        int max = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) 
                sum = nums[i];
            else 
                sum += nums[i];

                
            if (sum > max)
                max = sum;
        }
        return max;
    }
}