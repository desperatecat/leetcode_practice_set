//second solution: https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC283%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E7%A7%BB%E5%8A%A8%E9%9B%B6.md

class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
                
            }
        }
        for(int i=k; i<nums.length; i++){
                nums[i]=0;
            }
    }
}