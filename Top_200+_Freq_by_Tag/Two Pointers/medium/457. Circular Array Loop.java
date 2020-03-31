//https://leetcode.com/problems/circular-array-loop/discuss/94148/Java-SlowFast-Pointer-Solution
//slow/fast pointers
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                continue;
            }
            // slow/fast pointer
            int j = i, k = getIndex(i, nums);
            while (nums[k] * nums[i] > 0 && nums[getIndex(k, nums)] * nums[i] > 0) {
                if (j == k) {
                    // check for loop with only one element
                    if (j == getIndex(j, nums)) {
                        break;
                    }
                    return true;
                }
                j = getIndex(j, nums);
                k = getIndex(getIndex(k, nums), nums);
            }
            // loop not found, set all element along the way to 0
            j = i;
            int val = nums[i];
            while (nums[j] * val > 0) {
                int next = getIndex(j, nums);
                nums[j] = 0;
                j = next;
            }
        }
        return false;
    }
    
    public int getIndex(int i, int[] nums) {
        int n = nums.length;
        return i + nums[i] >= 0? (i + nums[i]) % n: n + ((i + nums[i]) % n);
    }
}





//https://leetcode.com/problems/circular-array-loop/discuss/94187/Java-solution-easy-to-follow
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        boolean found = false;

        for ( int n=0; n<nums.length; n++ ) {
            Integer ps = n;
            Integer pf = next(nums, 0, n);
            int dir = nums[n];

            while ( ps != null && pf != null && ps != pf ) {
                ps = next(nums, dir, ps);
                pf = next(nums, dir, next(nums, dir, pf));
            }

            if ( ps != null && ps == pf ) {
                found = true;
                break;
            }
        }

        return found;
    }

    Integer next(int[] nums, int dir, Integer pos) {
        if ( pos == null ) return null; // null, return null
        if ( dir * nums[pos] < 0 ) return null; // change in direction, return null

        Integer next = (pos + nums[pos]) % nums.length;
        if ( next < 0 ) next += nums.length; // wrap negative

        if ( next == pos ) next = null; // self-pointer, return null
        return next;
    }
}

