class Solution {
    List<List<Integer>> fin=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(new ArrayList<>(),nums,0);
        return fin;
    }
    public void helper(List<Integer> list,int[] nums,int depth)
    {
        if(depth==nums.length)
        {
            fin.add(new ArrayList<>(list));
            return ;
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(!list.contains(nums[i]))
                {
                    list.add(nums[i]);
                    helper(list,nums,depth+1);
                    list.remove(list.size()-1);
                }
            }
        }

    }
}