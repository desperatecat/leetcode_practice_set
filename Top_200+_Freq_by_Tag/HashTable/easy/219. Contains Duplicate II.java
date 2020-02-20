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