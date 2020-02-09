class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        // Ensure that n is at the last index
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return -1;
    }
}



//xor
//a number XOR itself will become 0, any number XOR with 0 will stay unchanged. So if every number from 1...n XOR with itself except the missing number, the result will be the missing number.
//example: 
//0 ^ 4 = 4      4 ^ 4 = 0
//1 ^ 1 ^ 2 ^ 2 ^ 3 =  3
public int missingNumber(int[] nums) {
    int res = nums.length;
    for(int i=0; i<nums.length; i++){
        res ^=i;    //i range: [0, n], because one element missing
        res ^=nums[i];  // nums[i] range: [0, n-1], so the two res xor must return the missing element
    }
    return res;
}