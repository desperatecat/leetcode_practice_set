
//calculate element value: K(i)(j)=K(i-1)(j-1)+K(i-1)(j) except for the first and last element

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if(numRows <= 0){
            return triangle;
        }
        
        
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                
                else{
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        
        return triangle;
    }
    
    
}