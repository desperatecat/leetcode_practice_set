class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        
        while(n!=0) {
            if(n%2 == 1 && n!=1)
                return false;
            n/=2;
        }
        return true;
    }
}