class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
       
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int prev = 0;
        int ans = 0;
        
        for(int i=s.length()-1;i>=0;--i){
            int curr = map.get(s.charAt(i));    //start from the right to left
            if(curr>=prev){
               ans+=curr;       //Normally Roman numerals are written largest to smallest from left to right
            }else{
                ans -=curr;     //curr<prev, meaning result should be: ans - curr
            }
            prev = curr;    //go to left
            
        }
        return ans;
    
    }
}