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


//https://github.com/MisterBooo/LeetCodeAnimation/blob/master/notes/LeetCode%E7%AC%AC119%E5%8F%B7%E9%97%AE%E9%A2%98%EF%BC%9A%E6%9D%A8%E8%BE%89%E4%B8%89%E8%A7%92II.md
class Solution {
  public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        long index = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) index);
            index = index * ( rowIndex - i ) / ( i + 1 );
        }
        return res; 
  }
}