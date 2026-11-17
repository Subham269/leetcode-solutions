class Solution {
    List<List<Integer>> fin = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        combi(new ArrayList<>(),k,n,1);
        return fin;
    }
    public void combi(List<Integer> list,int k,int n,int index )
    {
        if(list.size()==k)
        {
            fin.add(new ArrayList<>(list));
            return;
        }
        else
        {
            for(int i=index;i<=n;i++)
            {
                if(!list.contains(i))
                {
                    list.add(i);
                    combi(list,k,n,i);
                    list.remove(list.size()-1);
                }
            }
        }
    }
}