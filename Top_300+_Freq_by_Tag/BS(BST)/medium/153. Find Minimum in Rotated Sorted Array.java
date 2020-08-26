//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/discuss/48487/Java-solution-with-binary-search

class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            int start = 0, end = nums.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (mid > 0 && nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                }
                if (nums[start] <= nums[mid] && nums[mid] > nums[end]) {    //left half must be in order and the min must exist in the right half
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return nums[start];
    }
}