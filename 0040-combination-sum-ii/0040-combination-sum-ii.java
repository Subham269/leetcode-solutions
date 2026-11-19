class Solution {
    List<List<Integer>> fin=new ArrayList<>();
    int sum=0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combi(new ArrayList<>(),target,0,candidates);
        return fin;
    }
    public void combi(List<Integer> list, int target,int index,int[] candidates)
    {
        if(sum>target)
        return;
        else if(sum==target)
        {
            fin.add(new ArrayList<>(list));
        }
        else
        {
            for(int i=index;i<candidates.length;i++)
            {
                if(i>index&&candidates[i]==candidates[i-1])
                continue;
                sum+=candidates[i];
                list.add(candidates[i]);
                combi(list,target,i+1,candidates);
                sum-=candidates[i];
                list.remove(list.size()-1);
            }
        }
    }
}