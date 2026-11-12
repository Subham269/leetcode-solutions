class Solution {
    List<List<Integer>> fin=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        sub(new ArrayList<>(),0,nums,0);
        return fin;
    }
    public void sub(List<Integer> list,int index,int[] nums,int idx)
    {
        if(index==nums.length)
        {
            fin.add(new ArrayList<>(list));
            return;
        }
        else
        {
            for(int i=idx;i<nums.length+1;i++)
            {
                if(i==nums.length)
                {
                    sub(list,index+1,nums,i);
                }
                else
                {
                    List<Integer> temp=new ArrayList<>(list);
                    temp.add(nums[i]);
                    sub(temp,index+1,nums,i+1);
                }
                
            }
        }
    }
}