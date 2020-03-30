class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        
        if(nums==null || nums.length <4) return list;
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-3; i++){
           if(i>0 && nums[i]==nums[i-1]) continue;
            
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                
                int left = j+1, right = nums.length-1; 
                
                while(left<right){
                    int curr=nums[i]+nums[j]+nums[left]+nums[right];
                    
                    if(curr==target){
                        List<Integer> t = helper(nums, i,j,left,right);
                        list.add(new ArrayList<Integer>(t));
                        left++;
                        right--;
                        
                        while(left<right && nums[left]==nums[left-1]) {left++;}
                        while(left<right && nums[right]==nums[right+1]) {right--;}
                    } else if(curr<target){
                        left++;
                        
                    } else{
                        right--;
                    }
                }
            }
        }
        return list;
        
    }
    
    
    private List<Integer> helper(int[] nums, int i, int j, int k, int l){
        List<Integer> t = new ArrayList<>();
        t.add(nums[i]);
        t.add(nums[j]);
        t.add(nums[k]);
        t.add(nums[l]);
        return t;
    } 
    
    
    
}