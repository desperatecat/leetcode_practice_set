class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder(); // Google immutability or string vs stringbuilder if you don't know why
                                                // we use this instead of regular string
        int i = a.length() - 1, j = b.length() - 1, carry = 0; // two pointers starting from the back, just think of
                                                               // adding two regular ints from you add from back
        while (i >= 0 || j >= 0) {
            int sum = carry; // if there is a carry from the last addition, add it to carry
            if (j >= 0)
                sum += b.charAt(j--) - '0'; // we subtract '0' to get the int value of the char from the ascii
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            sb.append(sum % 2); // if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just
                                // like 1+9 is 0 if adding ints in columns); if sum==1 then append 1
            carry = sum / 2; // if sum==2 we have a carry, else if sum ==1, no carry because 1/2 rounds down
                             // to 0
        }
        if (carry != 0)
            sb.append(carry); // if finally we had carry, add it
        return sb.reverse().toString(); // remember to reverse
    }
}

// a = "1010", b = "1111"
// 0. i=3, j=3, carry=0
// 1. sum=0, sum=0+1=1, j=2, sum=1+0=1, i=2, sb='1', carry=0
// 2. sum=0, sum=0+1=1, j=1, sum=1+1=2, i=1, sb='10', carry=1
// 3. sum=1, sum=1+1=2, j=0, sum=2+0=2, i=0, sb='100', carry=1
// 4. sum=1, sum=1+1=2, j<0, sum=2+1=3, i<0, sb='1001', carry=1

// finally, sb='10011', return the reverse: '11001'