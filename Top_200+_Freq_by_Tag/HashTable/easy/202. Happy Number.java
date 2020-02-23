class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getNext(n);   //the sum will be a new n, and going to next getNext invoke
        }
        return n==1;
    }
    
    
    private int getNext(int n){
        int totalSum = 0;
        while(n>0){
            int d = n%10;   //first iter will be digit, next iter will be tens digit
            n = n/10;  
            totalSum += d*d;    
        }
        return totalSum;
    }
    
    
}