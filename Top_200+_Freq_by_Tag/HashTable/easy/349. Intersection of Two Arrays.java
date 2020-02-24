class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<Integer>();
    for (Integer n : nums1) set1.add(n);
    HashSet<Integer> set2 = new HashSet<Integer>();
    for (Integer n : nums2) set2.add(n);

    set1.retainAll(set2);  //retain all set2 element in set1, and remove other elements which are not in set2

    int [] output = new int[set1.size()];
    int idx = 0;
    for (int s : set1) {
        output[idx++] = s;
    }
    return output;
  }
}