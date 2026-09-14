class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        int max=0,count=1;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for( int val : map.values())
        {
            if(val==max)
            {
                count++;
            }
            if(val>max)
            {
                count=1;
                max=val;
            }
        }
        return (max*count);
    }
}