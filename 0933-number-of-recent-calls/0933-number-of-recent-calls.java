class RecentCounter {
    List<Integer> list=new ArrayList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        int count=0;
        list.add(t);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>=(t-3000)&&list.get(i)<=t)
            count++;
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */