class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int index = map.get(nums[i]);   //find the first duplicate element
                int diff = i - index;   //length between the first duplicate and the second duplicate element
                min = Math.min(min, diff);  //min is the smallest gap between two duplicate element
            }
            map.put(nums[i], i);
        }
        
        if(min<=k) return true;
        else return false;
    }
}




//slide window
//https://blog.csdn.net/fuxuemingzhu/article/details/77387169
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i - k - 1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}
