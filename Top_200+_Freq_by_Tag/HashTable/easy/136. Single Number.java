class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int i =0; i < nums.length ; i++){
            x ^= nums[i];   //a⊕0=a, a⊕a=0, a⊕b⊕a=(a⊕a)⊕b=0⊕b=b
        } 
        
        return x;
    
    }
}



//Hash Set
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i:nums){    //i represents nums[i] in this case
            if(!s.add(i)){  //if s already contains i, !s.add(i) will return true, then remove i 
                 s.remove(i);
            }
        }
        return s.iterator().next(); //return the one that's not been removed
    
    }
}