class Solution {
    public int[] singleNumber(int[] nums) {
       int[] result = new int[2];
       int xor =nums[0];
        for(int i=1;i < nums.length;i++){
            xor = xor ^ nums[i];
        }
        int x=0;
        int y=0;
        int setBitNumber = xor &~(xor-1);
        for(int i=0;i < nums.length;i++){
            if((nums[i] & setBitNumber) !=0){
                x = x ^ nums[i];
            }else{
                y = y ^ nums[i];
            }
        } 
        result[0] = x;
        result[1] = y;
        return result;
    }
}