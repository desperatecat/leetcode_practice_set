class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        
        int i=0;    //slow pointer
        int j=0;    //fast pointer
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;    //if slow and fast pointer are pointing to the same num, then fast pointer++
            }
            else{
                i++;    //if slow and fast pointer are not pointing to the same num, then slow and fast pointer all +1
                nums[i]=nums[j];    //copy nums[j] to nums[i+1] so that the fast pointer will kept +1 while nums[i]==nums[j]
                j++;
            }
        }
        return i+1;     //when j reach the end of array, i+1 is the length of the new non-duplicate array
    }
}