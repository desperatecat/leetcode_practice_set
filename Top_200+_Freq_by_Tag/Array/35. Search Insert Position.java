class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0]>=target){return 0;}
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length; //if target is bigger than the last element, then put target in the end of array, whose index is nums.length
    }
}