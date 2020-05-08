//https://leetcode.com/problems/restore-ip-addresses/discuss/30949/My-code-in-Java
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        int len = s.length();
        for(int i = 1; i<4 && i<len-2; i++){
            for(int j = i+1; j<i+4 && j<len-1; j++){
                for(int k = j+1; k<j+4 && k<len; k++){
                    String s1 = s.substring(0,i), s2 = s.substring(i,j), s3 = s.substring(j,k), s4 = s.substring(k,len);
                    if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)){
                        res.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
            }
        }
        return res;
    }
    public boolean isValid(String s){
        if(s.length()>3 || s.length()==0 || (s.charAt(0)=='0' && s.length()>1) || Integer.parseInt(s)>255)
            return false;
        return true;
    }
}



//backtracking
//https://leetcode.com/problems/restore-ip-addresses/discuss/31095/Backtracking-solution-in-Java-easy-to-understand
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        if(s == null || s.length() == 0 || s.length() > 12){
            return result;
        }
        StringBuilder builder = new StringBuilder();
        helper(result, s, builder, 0, 0);
        return result;
    }
    
    private void helper(List<String> result, String s, StringBuilder builder, int start, int count){
        if(start == s.length() && count == 3){
            result.add(builder.toString());
            return;
        }
        for(int i = start + 1; i <= s.length(); i++){
            String tmp = s.substring(start, i);
            if(tmp.length() > 3 || tmp.length() > 1 && tmp.charAt(0) == '0' || Integer.parseInt(tmp) > 255){
                return;
            }
            StringBuilder newBuilder = new StringBuilder(builder);
            if(newBuilder.length() != 0){
                newBuilder.append(".");
            }
            newBuilder.append(tmp);
            helper(result, s, newBuilder, i, newBuilder.length() == tmp.length() ? count : count + 1);
        }
    }
}