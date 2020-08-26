//https://leetcode.com/problems/merge-sorted-array/discuss/29704/My-clean-java-solution

class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? 
                                 nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //nums1 doesn't have valid element, only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }

    }
    
}


//nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
// nums1 = [1,2,3,0,0,0], m = 3, tail1 = 2
// nums2 = [2,5,6],       n = 3, tail2 = 2
// finished = 5

// nums1[5] = nums2[2] == 6, tail2 = 1, finished = 4
// nums1[4] = nums2[1] == 5, tail2 = 0, finished = 3
// nums1[3] = nums1[2] == 3, tail1 = 1, finished = 2
// nums1[2] = nums2[0] == 2, tail1 = 0, finished = 1, tail2 = -1
// nums1[1] = nums1[0] == 2, tail1 = -1, finished = 0
// nums1[0] = nums1[0], jump out from while, stay the same