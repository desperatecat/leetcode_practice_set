class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }
        }

        for(int i = k; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}



//https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC283%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E7%A7%BB%E5%8A%A8%E9%9B%B6.md
//swap
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}