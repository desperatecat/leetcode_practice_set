//array
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            map.put(numbers[i], i);
        }
        
        for(int i=0; i<numbers.length; i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp) && map.get(temp)!=i){
                if(map.get(temp) > i){
                    return new int[]{i+1, map.get(temp)+1};
                }
                return new int[]{map.get(temp)+1, i+1};
            }
        }
        throw new IllegalArgumentException("No two sum result!");
    }
}


//bs
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/discuss/51239/Share-my-java-AC-solution.
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indice = new int[2];
        if(numbers == null || numbers.length<2) return indice;
        int left = 0, right = numbers.length-1;
        
        while(left<right){
            int v = numbers[left]+ numbers[right];
            if(v == target){
                indice[0] = left+1;
                indice[1] = right+1;
                break;
            } else if (v>target){
                right--;
            } else {
                left++;
            }
            
        }
        return indice;
        
    }
}