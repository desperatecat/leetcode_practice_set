//https://github.com/grandyang/leetcode/issues/58

class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != ' ') {
                if (i != 0 && s.charAt(i - 1) == ' ') res = 1; //only 1 length of last word
                else ++res;
            }
        }
        return res;
    }
}