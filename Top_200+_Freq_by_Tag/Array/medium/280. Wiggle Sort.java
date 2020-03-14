//https://github.com/grandyang/leetcode/issues/280

// Time Complexity O(n)
class Solution {
    public void wiggleSort(int[] nums) {
        if (nums.length <= 1) return;
        for (int i = 1; i < nums.length; ++i) {
            if ((i % 2 == 1 && nums[i] < nums[i - 1]) || (i % 2 == 0 && nums[i] > nums[i - 1])) {
                swap(nums[i], nums[i - 1]);
            }
        }
    }

    public void swap(int i, int j){
        int temp = j;
        j = i;
        i = temp;
    }
}