//https://leetcode.com/problems/isomorphic-strings/discuss/57874/Java-solution-with-1-line-core-code

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
    
        for(Integer i = 0; i < s.length(); i++) {   //here we use Integer instead of int because Map.put() returns Integer. For Integer >= 128, == check their reference, not value.

            if(m1.put(s.charAt(i), i) != m2.put(t.charAt(i), i)) {  //Map.put() returns Integer
                return false;
            }
        }
        return true;
    }
}

//Map.put() api: https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html#put(K,%20V)
// it returns the previous value associated with key, or null if there was no mapping for key

// For simplification lets take s1 = "add", s2 = "egf"

// 1st iteration: Integer i = 0, s1.charAt(i) is 'a', s2.charAt(i) is 'e'

// m1.put(s1.charAt(i), i) returns null
// m2.put(s2.charAt(i), i) returns null

// 2nd iteration: Integer i = 1, s1.charAt(i) is 'd', s2.charAt(i) is 'g'

// m1.put(s1.charAt(i), i) returns null
// m2.put(s2.charAt(i), i) returns null

// 3nd iteration: Integer i = 2, s1.charAt(i) is 'd', s2.charAt(i) is 'f'

// m1.put(s1.charAt(i), i) returns Integer obj ref (value 1)
// m2.put(s2.charAt(i), i) returns null (1 != null returns false;)

// if s2 = "egg" instead of "egf"
// 3nd iteration: Integer i = 2, s1.charAt(i) is 'd', s2.charAt(i) is 'g'

// m1.put(s1.charAt(i), i) returns Integer obj ref (value 1)
// m2.put(s2.charAt(i), i) returns Integer obj ref (value 1)
// (same object created during 2nd iteration)

// loop ends and we will return true!