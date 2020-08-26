//https://leetcode.com/problems/ugly-number-ii/discuss/811303/Detailed-Explanation-with-Code

class Solution {
        public int nthUglyNumber(int n) {
            if(n <= 0) return 0;

            int twoIndex = 0;
            int threeIndex = 0;
            int fiveIndex = 0;

            List<Integer> ugly = new ArrayList();
            ugly.add(1);

            int nback = n;
            while(n-- > 1) {
                int by2 = ugly.get(twoIndex) * 2;
                int by3 = ugly.get(threeIndex) * 3;
                int by5 = ugly.get(fiveIndex) * 5;

                int min = Math.min(by2, Math.min(by3, by5));
                ugly.add(min);

                if(min == by2) twoIndex++;
                if(min == by3) threeIndex++;
                if(min == by5) fiveIndex++;
            }

            return ugly.get(nback - 1);
        }
    }