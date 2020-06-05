//https://leetcode.com/problems/ugly-number/discuss/663418/Java-solution-faster-than-100
class Solution {
    public boolean isUgly(int num) {
        while(num>1){
            if(num == num/2*2)
                num = num/2;
            else if(num == num/3*3)
                num = num/3;
            else if(num == num/5*5)
                num = num/5;
            else
                break;
        }
        return num==1;
    }
}