class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList();
    }
    
    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }
}

// [1-3000,1] include 1; count 1
// [2-3000,2] include 1,2; count 2
// [3001-3000,3001] include 1,2,3001; count 3
// [3002-3000,3002] include 2,3001,3002; count 3


/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */