class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        
        else if (nums[0] != 0) {
            return 0;
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return -1;
    }
}



//