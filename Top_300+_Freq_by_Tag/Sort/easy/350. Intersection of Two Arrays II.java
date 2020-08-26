//https://leetcode.com/problems/intersection-of-two-arrays-ii/discuss/82238/4ms-java-solution
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> myList = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                myList.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[myList.size()];
        int k = 0;
        for (Integer num : myList) {
            result[k++] = num;
        }
        return result;
    }
}