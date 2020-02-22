class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();

        // freq count for nums1
        for (int num : nums1) map.put(num, map.getOrDefault(num, 0) + 1);   //map.put(num, map.getOrDefault(num, 0) + 1) is the same as: if (map.containsKey(num)) map.put(num, map.get(num) + 1); else map.put(num, 1);
        
        // collect result
        ArrayList<Integer> result = new ArrayList();
        
        for (int num: nums2) {
            if (map.containsKey(num)){
                result.add(num);
                map.put(num, map.get(num) - 1); //if nums2 contains the same element as nums1, freq - 1
                map.remove(num, 0);
            }
        }
       // convert result
       int[] r = new int[result.size()];
       for(int i = 0; i < result.size(); i++) {
           r[i] = result.get(i);
       }
       return r;
    }
}