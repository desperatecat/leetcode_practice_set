//https://leetcode.com/problems/array-partition-i/discuss/102170/Java-Solution-Sorting.-And-rough-proof-of-algorithm.

class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        
        int result = 0;
        for(int i=0; i<nums.length;i+=2){    // In a sorted array, the shortest distance sum will be all pairs not overlap, meaning b1<a2
            result+=nums[i];
        }
        return result;
    }
}