//https://leetcode.com/problems/3sum/discuss/7399/Easiest-Java-Solution

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && (nums[i] == nums[i - 1])) // skip duplicate
                continue;
            int left = i + 1, right = nums.length - 1; // two pointers, left is start at i+1 since left counld not be the same as i
            int target = -nums[i]; // nums[i]+nums[left]+nums[right]=0, means: nums[left]+nums[right]=-nums[i]
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) // skip duplicate
                        left++;
                    while (left < right && nums[right] == nums[right + 1]) // skip duplicate
                        right--;
                } else if (nums[left] + nums[right] < target) { // sorted array!!!
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;

    }
}