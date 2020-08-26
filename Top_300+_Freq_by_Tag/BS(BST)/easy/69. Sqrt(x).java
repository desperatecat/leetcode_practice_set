//https://leetcode.com/problems/sqrtx/discuss/25047/A-Binary-Search-Solution
class Solution {
    public int mySqrt(int x) {
        int left = 1, right = x;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    return right;
 
        
    }
}