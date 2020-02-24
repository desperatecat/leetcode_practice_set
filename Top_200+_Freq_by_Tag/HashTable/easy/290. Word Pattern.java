//https://leetcode.com/problems/word-pattern/discuss/73402/8-lines-simple-Java

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index1 = new HashMap();
        Map index2 = new HashMap();
        for (Integer i=0; i<words.length; ++i){
            if (index1.put(pattern.charAt(i), i) != index2.put(words[i], i))
                return false;
        }
            
        return true;
    }
}



//Map.put() api: https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html#put(K,%20V)
// Map.put() returns the previous value associated with key, or null if there was no mapping for key

// For simplification lets take pattern = "add", words = ["dog", "cat", "cat"]

// 1st iteration: Integer i = 0, pattern.charAt(i) is 'a',  words[i] is "dog"
// index1.put(pattern.charAt(i), i) == null, index2.put(words[i], i) == null

// 2nd iteration: Integer i = 1, pattern.charAt(i) is 'd',  words[i] is "cat"
// index1.put(pattern.charAt(i), i) == null, index2.put(words[i], i) == null

// 1st iteration: Integer i = 2, pattern.charAt(i) is 'd',  words[i] is "cat"
// index1.put(pattern.charAt(i), i) returns Integer obj ref (value 1)
// index2.put(words[i], i) returns Integer obj ref (value 1)
// (same object created during 2nd iteration)