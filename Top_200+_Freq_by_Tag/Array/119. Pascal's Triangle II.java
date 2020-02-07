//https://leetcode.com/problems/pascals-triangle-ii/discuss/38478/My-accepted-java-solution-any-better-code

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        
        if(rowIndex<0){return list;}
        
        for(int i=0; i<rowIndex+1; i++){
            list.add(0, 1); //add 1 to index 0, other elements move right side by side
            
            for(int j=1; j<list.size()-1; j++){
                list.set(j, list.get(j)+list.get(j+1));
            }
            
        }
        return list;
    }
}