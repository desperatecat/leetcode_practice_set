/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */


//https://leetcode.com/problems/first-bad-version/solution/
//https://github.com/grandyang/leetcode/issues/278
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left<right){
            int mid = left + (right - left)/2;  //avoid overflow when left and right are extremly large
            if(isBadVersion(mid)!=false){
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}