public class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	for(int i = 0; i <  nums.length; i++) {
		Integer ord = map.put(nums[i], i); //if repeat return the repeat value(the key's value),else return null
		if(ord != null && i - ord <= k) {
			return true;
		}
	}
	
	return false;
    }
}