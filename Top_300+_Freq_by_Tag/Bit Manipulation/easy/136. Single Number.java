class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i:nums){
            if(!s.add(i)){
                 s.remove(i);
            }
        }
        return s.iterator().next();
    
    }
}