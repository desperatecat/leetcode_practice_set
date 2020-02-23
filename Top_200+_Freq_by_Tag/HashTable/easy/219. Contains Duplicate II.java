//https://leetcode.com/problems/contains-duplicate-ii/discuss/61572/Java-solution-using-HashMap's-put()

public class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	for(int i = 0; i <  nums.length; i++) {
		Integer ord = map.put(nums[i], i); //if repeat return the repeat value(the key's value, which is previous i),else return null
		if(ord != null && i - ord <= k) {
			return true;
		}
	}
	
	return false;
    }
}

// Map.put() returns the previous value associated with key, or null if there was no mapping for key
//for example, given [1,2,3,1], k=3 
//1st iteration: i=0, ord = map.put(nums[0], 0), ord = null
//2nd iteration: i=1, ord = map.put(nums[1], 1), ord = null
//3rd iteration: i=2, ord = map.put(nums[2], 2), ord = null
//4th iteration: i=3, ord = map.put(nums[3], 3), since nums[3] == nums[0], now it maps to the key nums[0], so ord = 0
//i-ord<=3, return true