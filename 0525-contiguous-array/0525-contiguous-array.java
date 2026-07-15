class Solution {
    public int findMaxLength(int[] nums) 
    {
        if(nums.length<2)
        return 0;
        int prefix[]=new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=nums.length,i,max=0,sum=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]==0)
            sum+=-1;
            else 
            sum+=1;
            prefix[i]=sum;
            if(!map.containsKey(sum))
            map.put(sum,i);
        }
        for(i=1;i<n;i++)
        {
            if(prefix[i]==0)
            {
                max=Math.max(max,i-0+1);
            }
            else if(map.containsKey(prefix[i]))
            {
                max=Math.max(max,i-map.get(prefix[i]));
            }
        }
        return max;
    }
}