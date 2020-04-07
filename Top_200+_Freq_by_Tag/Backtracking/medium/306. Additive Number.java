//https://leetcode.com/problems/additive-number/discuss/75651/Backtracking-with-Pruning%3A-Java-3-ms-Solution-and-Python-48-ms-Solution
class Solution {
    public boolean isAdditiveNumber(String num) {
        if (num == null || num.length() < 3) return false;
        int n = num.length();
        for (int i = 1; i < n; i++) {
            if (i > 1 && num.charAt(0) == '0') break;
            for (int j = i+1; j < n; j++) {
                int first = 0, second = i, third = j;
                if (num.charAt(second) == '0' && third > second+1) break;
                while (third < n) {
                    Long result = (Long.parseLong(num.substring(first, second)) + 
                                   Long.parseLong(num.substring(second, third)) );
                    if (num.substring(third).startsWith(result.toString())) {
                        first = second; second = third; third += result.toString().length();
                    }
                    else {
                        break;
                    }
                }
                if (third == n) return true;
            }
        }
        return false;
    }
}



//https://leetcode.com/problems/additive-number/discuss/75572/*Java*-very-straightforward-solution-with-detailed-explanation
class Solution {
    public boolean isAdditiveNumber(String num) {
        int L = num.length();

        // choose the first number A
        for(int i=1; i<=(L-1)/2; i++) {
            // A cannot start with a 0 if its length is more than 1
            if(num.charAt(0) == '0' && i>=2) break; //previous code: continue;
        
            // choose the second number B
            for(int j=i+1; L-j>=j-i && L-j>=i; j++) {
                // B cannot start with a 0 if its length is more than 1
                if(num.charAt(i) == '0' && j-i>=2) break; // previous: continue;
            
                long num1 = Long.parseLong(num.substring(0, i)); // A
                long num2 = Long.parseLong(num.substring(i, j)); // B
                String substr = num.substring(j); // remaining string
            
                if(isAdditive(substr, num1, num2)) return true; // return true if passes isAdditive test
                // else continue; // continue for loop if does not pass isAdditive test
            }
        }
        return false; // does not pass isAdditive test, thus is not additive
    }

    // Recursively checks if a string is additive
    public boolean isAdditive(String str, long num1, long num2) {
        if(str.equals("")) return true; // reaches the end of string means a yes
    
        long sum = num1+num2;
        String s = ((Long)sum).toString();
        if(!str.startsWith(s)) return false; // if string does not start with sum of num1 and num2, returns false
    
        return isAdditive(str.substring(s.length()), num2, sum); // recursively checks the remaining string
    }
}