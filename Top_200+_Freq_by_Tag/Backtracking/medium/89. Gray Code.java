//backtracking
//https://leetcode.com/problems/gray-code/discuss/30087/Backtracking-Solution
class Solution {
    public static List<Integer> grayCode(int n) {
		List<Integer> code = new ArrayList<Integer>();
		code.add(0);
		genCodes(code,n,0,1<<n);
		return code;
	}
	public static void genCodes(List<Integer> code, int n, int curr, int size) {
		if(code.size()==size) return;
		for(int i=0;i<n;i++) {
			int mask = 1<<i;
			int el = (curr^mask);
			if(!code.contains(el)) {
				code.add(el);
				genCodes(code,n,el,size);
				if(code.size()==size) return;
				code.remove(new Integer(el));
			}
		}
	}
}





//https://leetcode.com/problems/gray-code/discuss/29891/Share-my-solution
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rs=new ArrayList<Integer>();
        rs.add(0);
        for(int i=0;i<n;i++){
            int size=rs.size();
            for(int k=size-1;k>=0;k--)
                rs.add(rs.get(k) | 1<<i);
        }
        return rs;
    }

}