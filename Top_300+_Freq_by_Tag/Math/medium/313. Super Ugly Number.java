//https://leetcode.com/problems/super-ugly-number/discuss/76291/Java-three-methods-23ms-36-ms-58ms(with-heap)-performance-explained
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int [] res = new int[n];
        res[0] = 1;
        int [] cur = new int[primes.length];

        for(int i = 1; i < n; i++){
            res[i] = Integer.MAX_VALUE;
            for(int j = 0; j < primes.length; j++){
                if (primes[j] * res[cur[j]] == res[i-1]) {
                    cur[j]++;
                }
                res[i] = Math.min(res[i], primes[j]*res[cur[j]]);
            }
        }
        return res[n-1];
    }
}