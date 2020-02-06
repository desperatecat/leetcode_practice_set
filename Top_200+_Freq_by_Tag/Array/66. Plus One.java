class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        //Traverse forward from the end of the array
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                digits[i]++;
                //No carry, return directly
                return digits;
            }
            //Generate carry, need to assign this bit to 0
            digits[i] = 0;
        }
        //Carry is generated overall, the length of the array needs to be changed plus 1
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}