class Solution {
    List<List<Integer>> fin = new ArrayList<>();
    int sum=0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        combi(new ArrayList<>(),k,n,1);
        return fin;
    }
    public void combi(List<Integer> list,int k,int n,int index)
    {
        if(list.size()==k)
        {
            if(sum==n)
            fin.add(new ArrayList<>(list));
            return;
        }
        else
        {
            for(int i=index;i<=9;i++)
            {
                list.add(i);
                sum+=i;
                combi(list,k,n,i+1);
                sum-=list.get(list.size()-1);
                list.remove(list.size()-1);
            }
        }
    }
}