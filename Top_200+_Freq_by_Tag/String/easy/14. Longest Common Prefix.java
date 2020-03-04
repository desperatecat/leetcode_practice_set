class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];   //first string of the string list
        for (int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(pre) != 0)   //indexof(string) will return the first occurrence of that string
                pre = pre.substring(0,pre.length()-1);  //if strs[i] did not contains pre, then use the substring of pre, reduce one char each time
        }
        return pre;
    }
}