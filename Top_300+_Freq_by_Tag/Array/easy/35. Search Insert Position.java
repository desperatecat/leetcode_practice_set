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




//binary search

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low; //as long as low>high, low will definitely be return, which is the target's index
    }
}