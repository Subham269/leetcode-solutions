class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        int[] ans=new int[k];
        int i,index;
        for(i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            list.add(new ArrayList<>());
        }
        list.add(new ArrayList<>());
        for(int num : map.keySet())
        {
            list.get(map.get(num)).add(num);
        }
        index=0;
        for(i=nums.length;i>=0 && index<k ; i--)
        {
            for(int num : list.get(i))
            {
                ans[index++]=num;
                if(index==k)
                break;
            }
        }
        return ans;
    }
}