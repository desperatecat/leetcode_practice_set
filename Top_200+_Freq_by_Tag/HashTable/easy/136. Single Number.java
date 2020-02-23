class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
       for (int i =0; i < nums.length ; i++){
            x ^= nums[i];   //a⊕0=a, a⊕a=0, a⊕b⊕a=(a⊕a)⊕b=0⊕b=b
       } 
        
        return x;
    
    }
}