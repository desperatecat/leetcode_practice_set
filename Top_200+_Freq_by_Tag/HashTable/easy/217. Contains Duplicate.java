//sort

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}


//Hash Table
class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}
}