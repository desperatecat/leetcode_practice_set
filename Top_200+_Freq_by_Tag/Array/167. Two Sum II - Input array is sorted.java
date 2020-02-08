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