class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}



// HashMap
public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int maxNum = 0, maxCount = 0;
    for (int num: nums) {
      int count = map.getOrDefault(num, 0) + 1;
      map.put(num, count);
      if (count > maxCount) {
        maxCount = count;
        maxNum = num;
      }
    }
    return maxNum;
  }




//Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums){
        int count = 0;
        Integer candidate = null;
        
        for (int num:nums){
            if(count==0) candidate=num;
            count += (num==candidate)? 1 : -1;
        }
        return candidate;
    }
