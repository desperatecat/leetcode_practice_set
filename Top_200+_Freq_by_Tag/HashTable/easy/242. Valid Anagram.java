//sorting
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
    }
}



//hash table
//https://mp.weixin.qq.com/s/o5HTxmOgpftSaQdebS9zyQ
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++; //it "shifts" the ascii/unicode value so that a - z have values 0 - 25, and 'b' - 'a' == 1, 'c' - 'a' == 2
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            //if table[t.charAt(i) - 'a'] < 0, t contains a letter which not exists in s
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}