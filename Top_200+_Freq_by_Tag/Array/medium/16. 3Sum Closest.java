class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[nums.length - 1];
        int closestSum = sum;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (nums[i] != nums[i - 1])) // skip duplicate
            {

                int j = i + 1, k = nums.length - 1;
                while (j < k) {
                    sum = nums[i] + nums[j] + nums[k];

                    if (sum < target) {

                        while (j < k && nums[j] == nums[j + 1]) // skip duplicate
                        {
                            j++;
                        }
                        j++;
                    } else if (sum > target) {

                        while (j < k && nums[k] == nums[k - 1]) // skip duplicate
                        {
                            k--;
                        }
                        k--;
                    } else {
                        return sum;
                    }

                    if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                        closestSum = sum;
                    }
                }
            }

        }
        return closestSum;
    }
}