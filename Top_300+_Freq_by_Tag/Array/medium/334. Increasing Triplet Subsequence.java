//https://leetcode.com/problems/increasing-triplet-subsequence/discuss/815768/Java-Same-as-others-with-printing-triplet-and-comments

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int sec   = Integer.MAX_VALUE;
        int[] triplet =new int[3];

        for(int i=0; i < nums.length ;i++){
            if(nums[i] <= first){
                first =nums[i];
            }else if(nums[i] <= sec){// here at 2nd max we need to record 1st max. because when the 3rd max occurs, there won't be any chance of updating 1st and 2nd..similarly for nth tuple, we need to record at n-1th place, as the control crossed all the n-2 smaller numbers.If any updates post to that and that doesn't reach n-1th place, here in this program 2nd max , we don't bother as that will not contribute to the out put deciding factor.
                sec = nums[i];
                triplet[0]=first;
                triplet[1]=sec;
            }else{
                triplet[2]=nums[i];
                System.out.println(Arrays.toString(triplet));
             return true;   
            }
        }
        return false;
    }
}