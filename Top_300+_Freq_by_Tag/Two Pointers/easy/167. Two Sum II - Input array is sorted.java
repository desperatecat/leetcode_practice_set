//https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC167%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E4%B8%A4%E6%95%B0%E4%B9%8B%E5%92%8CII-%E8%BE%93%E5%85%A5%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84.md
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/discuss/51239/Share-my-java-AC-solution.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indice = new int[2];
        if(numbers == null || numbers.length < 2) return indice;


        int l = 0, r = numbers.length - 1;

        while(l<r){
            if (numbers[l] + numbers[r] > target){
                r--;
            } else if (numbers[l] + numbers[r] == target){
                //return new int[] {l+1, r+1};  //this is the same as the following code
                indice[0] = l+1;
                indice[1] = r+1;
                break;
                
            }
            else {
                l++;
            }
        }
        return indice;
    }
}