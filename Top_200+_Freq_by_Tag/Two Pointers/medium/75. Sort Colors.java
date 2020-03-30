//https://github.com/grandyang/leetcode/issues/75
//https://leetcode.com/problems/sort-colors/discuss/26549/Java-solution-both-2-pass-and-1-pass
class Solution {
    public void sortColors(int[] nums) {
         // 1-pass
        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;    //nums[index] is changed, so we need to go left 1 step of index, and after index++, the value of nums[index] will be recheck
            }
            index++;
        }
    }
}