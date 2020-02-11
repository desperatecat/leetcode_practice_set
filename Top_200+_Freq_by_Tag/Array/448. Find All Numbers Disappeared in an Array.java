//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/discuss/92956/Java-accepted-simple-solution

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            int val = Math.abs(nums[i])-1;  //Because the elements in the Array are from 1 to n, so subtracting 1 will be 0 to n-1 which are the index of the array.
            if(nums[val]>0){
                nums[val] = -nums[val];
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                ret.add(i+1);
            }
        }
        return ret;
    }
}