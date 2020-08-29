//https://leetcode.com/problems/reconstruct-itinerary/discuss/811482/Java-or-Simple-solution-using-DFS
class Solution {
    public List<String> findItinerary(List<List<String>> tickets) { 
        Map<String,PriorityQueue<String>> map = new HashMap<>();
        
        for(List<String> l : tickets) {
            if(map.containsKey(l.get(0)))
                map.get(l.get(0)).add(l.get(1));
            else {
                PriorityQueue<String> pq = new PriorityQueue<>();
                pq.add(l.get(1));
                map.put(l.get(0),pq);
            }
        }
        
        List<String> ans = new ArrayList<>();
        dfs(map, ans, "JFK");
        
        Collections.reverse(ans);
        
        return ans;
    }
    
    public static void dfs(Map<String,PriorityQueue<String>> map, List<String> ans, String index) {
        PriorityQueue<String> pq = map.get(index);
        
        while(pq != null && !pq.isEmpty()) {
            String i = pq.poll();
            dfs(map,ans,i);
        }
        
        ans.add(index);
    }
}