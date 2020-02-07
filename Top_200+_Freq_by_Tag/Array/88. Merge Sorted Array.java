
//https://github.com/azl397985856/leetcode/blob/master/problems/88.merge-sorted-array.md

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int current = m+n-1;
        
        while(current>=0){
            
            if(n==0) return;
            
            if(m<1){
                nums1[current--] = nums2[--n];
                continue;
            }
            
            if(n<1){
                nums1[current--] = nums1[--m];
                continue;
            }
            
            
            if(nums1[m-1]>nums2[n-1]){
                nums1[current--] = nums1[--m];
            } else{
                nums1[current--] = nums2[--n];
            }
            
        }
        
        
        
        
    }
}



//https://leetcode.com/problems/merge-sorted-array/discuss/29704/My-clean-java-solution

class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? 
                                 nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //nums1 doesn't have valid element, only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }
    }
    
}