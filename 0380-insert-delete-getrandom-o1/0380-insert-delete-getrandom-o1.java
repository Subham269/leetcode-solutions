class RandomizedSet {
    HashMap<Integer,Integer> map;
    ArrayList<Integer> list;
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val))
        {
            map.put(val,list.size());
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val))
        {
            int num=list.get(list.size()-1);
            list.set(map.get(val),num);
            list.remove(list.size()-1);
            map.put(num,map.get(val));
            map.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Random rand=new Random();
        return list.get(rand.nextInt(list.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */