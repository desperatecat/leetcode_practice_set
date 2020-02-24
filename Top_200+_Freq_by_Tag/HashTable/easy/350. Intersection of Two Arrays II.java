class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();

        // freq count for nums1
        for (int n1 : nums1) {
            map.put(n1, map.getOrDefault(n1, 0) + 1);   //map.put(n1, map.getOrDefault(n1, 0) + 1) is the same as: if (map.containsKey(n1)) map.put(n1, map.get(n1) + 1); else map.put(n1, 1);
        }
        // collect result
        ArrayList<Integer> result = new ArrayList();
        
        for (int n2: nums2) {
            if (map.containsKey(n2)){
                result.add(n2);
                map.put(n2, map.get(n2) - 1); //if n2 contains the same element as n1, freq - 1
                map.remove(n2, 0); //if freq is 0, remove the pair (n2--0) from the map
            }
        }
       // convert result
       int[] output = new int[result.size()];
        int i = 0;
       for(int r:result) {
           output[i++] = r;
       }
       return output;
    }
}

//why we need to map.remove(n2, 0)?
// for example, input:[4,9,5], [9,4,9,8,4]
// if we don't remove, output will be [9,4,9,4] instead of [4,9],
// because the key will still exist while nums2 is iterating (but now nums1 didn't contain this key any more)