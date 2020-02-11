
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && (nums[i] == nums[i - 1]))
                continue; // skip duplicate
            int j = i + 1, k = nums.length - 1; // two pointers
            int target = -nums[i]; // nums[i]+nums[j]+nums[k]=0, means: nums[j]+nums[k]=-nums[i]
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++; // skip duplicate
                    while (j < k && nums[k] == nums[k + 1])
                        k--; // skip duplicate
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return list;

    }
}