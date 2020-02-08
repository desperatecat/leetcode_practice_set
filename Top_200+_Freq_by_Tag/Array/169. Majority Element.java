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


//Boyer-Moore Voting Algorithm
//https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC169%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E6%B1%82%E4%BC%97%E6%95%B0.md
public int majorityElement(int[] nums) {
    int candidate = nums[0], count = 1;
    for (int i = 1; i < nums.length; ++i) {
      if (count == 0) {
        candidate = nums[i];
        count = 1;
      } else if (nums[i] == candidate) {
        count++;
      } else{
        count--;
      }
    }
    return candidate;
  }