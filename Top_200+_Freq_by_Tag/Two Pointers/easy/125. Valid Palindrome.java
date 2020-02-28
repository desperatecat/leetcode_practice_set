//https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC125%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E9%AA%8C%E8%AF%81%E5%9B%9E%E6%96%87%E4%B8%B2.md
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0)
             return true;
        int l = 0, r = s.length() - 1;
        while(l < r){
            //make sure the charcter is letter or number
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else{
                if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                    return false;
                l++;
                r--;
            } 
        }
        return true;
    }
}