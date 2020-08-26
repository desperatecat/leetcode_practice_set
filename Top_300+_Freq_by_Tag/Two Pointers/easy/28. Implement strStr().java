//https://leetcode.com/problems/implement-strstr/discuss/12807/Elegant-Java-solution
class Solution {
     public int strStr(String haystack, String needle) {
        // empty needle appears everywhere, first appears at 0 index
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;
        
        
        for (int i = 0; i < haystack.length(); i++) {
            // no enough places for needle after i
            if (i + needle.length() > haystack.length()) break;
            
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
                if (j == needle.length()-1)
                    return i;
            }
        }
        
        return -1;
    }
}

//workaround:
// haystack = "hello", needle = "ll"
// haystack.length() = 5, needle.length() = 2,
// i=0, j=0, haystack.charAt(0) != needle.charAt(0), break
// i=1, j=0, haystack.charAt(1) != needle.charAt(0), break
// i=2, j=0, haystack.charAt(2) = needle.charAt(0), j+1
// i=2, j=1, haystack.charAt(3) = needle.charAt(1), j==needle.length()-1, return i=2