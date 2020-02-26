// Follow-up 2
// What if nums1's size is small compared to nums2's size? Which algorithm is better?

// If the arrays are not sorted, then the HashMap solution is faster.

// If the arrays are sorted, then we can loop through nums1 (the smaller array), and for each value, binary search it in nums2 (the larger array). Implementation becomes tricky since duplicate values are allowed.

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      if (nums1 == null || nums2 == null) {
            return new int[0];
        } else if (nums1.length > nums2.length) {
            return intersect(nums2, nums1); // ensures 1st array is shorter than 2nd.
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> intersection = new ArrayList();
        int leftIndex = 0;
        for (int i = 0; i < nums1.length; i++) {
            Integer index = binarySearch(nums2, nums1[i], leftIndex);
            if (index != null) {
                intersection.add(nums1[i]);
                leftIndex = index + 1;
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

    // Binary search from 'lo' to end of array.
    // If duplicates exist, return the index for the match furthest left.
    private Integer binarySearch(int[] sortedArray, int value, int lo) {
        int hi = sortedArray.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (sortedArray[mid] < value) {
                lo = mid + 1;
            } else if (sortedArray[mid] > value) {
                hi = mid - 1;
            } else {
                hi = mid;
            }
        }
        return lo < sortedArray.length && sortedArray[lo] == value
             ? lo
             : null;
    }
}