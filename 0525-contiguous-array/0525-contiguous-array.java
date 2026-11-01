class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0,len=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            sum+=1;
            else 
            sum-=1;
            if(!map.containsKey(sum))
            map.put(sum,i);
        }
        sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            sum+=1;
            else 
            sum-=1;

            if(sum==0)
            len=i+1;
            else 
            {
                if(i!=map.get(sum))
                {
                    len=i-map.get(sum);
                }
            }
            max=Math.max(max,len);
        }
        return max;
    }
}