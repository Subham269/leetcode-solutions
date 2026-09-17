class Solution {
    public long countBadPairs(int[] nums) 
    {   
        int i,j;
        long count=0,tot=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<nums.length;i++)
        {
            map.put(i-nums[i],map.getOrDefault((i-nums[i]),0)+1);
        }
        tot=((long)nums.length*(nums.length-1))/2;
        for (int val : map.values())
        {
            if(val>1)
            count+=((long)val*(val-1))/2;
        }
        return (tot-count);
        
    }
}