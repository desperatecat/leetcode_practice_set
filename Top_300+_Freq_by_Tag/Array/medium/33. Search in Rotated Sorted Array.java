//https://www.cnblogs.com/grandyang/p/4325648.html
//https://leetcode.com/problems/search-in-rotated-sorted-array/discuss/14472/Java-AC-Solution-using-once-binary-search

class Solution {
    public int search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1;

        while(left <= right){ //remember '<='
            int mid = (right + left)/2;
            if(nums[mid] == target) return mid;

            if(nums[mid] <= nums[right]){
                if(nums[mid] < target && nums[right] >= target) left = mid + 1;
                else right = mid - 1;
            }
            
            if(nums[mid] >= nums[left]){
                if(nums[left] <= target && nums[mid] > target) right = mid - 1;
                else left = mid + 1;
            }
        }
        return -1;
    }
}