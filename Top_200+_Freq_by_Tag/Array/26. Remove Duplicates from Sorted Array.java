//https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC26%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E5%88%A0%E9%99%A4%E6%8E%92%E5%BA%8F%E6%95%B0%E7%BB%84%E4%B8%AD%E7%9A%84%E9%87%8D%E5%A4%8D%E9%A1%B9.md

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



//more clear two poiters solution

public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}