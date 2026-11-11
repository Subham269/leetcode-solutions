class Solution {
    List<List<Integer>> fin= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combi(new ArrayList<>(),0,0,target,candidates);
        return fin;
    }
    public void combi(List<Integer> list,int index,int sum,int target,int[] candidates)
    {
        if(sum>target)
        return ;
        if(sum==target)
        {
            fin.add(new ArrayList<>(list));
            return ;
        }
        for(int i=index;i<candidates.length;i++)
        {
            list.add(candidates[i]);
            int temp=sum + candidates[i];
            combi(list,i,temp,target,candidates);
            list.remove(list.size()-1);
        }
    }
}