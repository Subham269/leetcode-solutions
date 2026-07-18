class Solution {
    public int maxSubarraySumCircular(int[] nums) 
    {
        int best=nums[0],current=nums[0],min=nums[0],sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            current=Math.max(nums[i],nums[i]+current);
            best=Math.max(best,current);
        }
        current=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            current=Math.min(nums[i],nums[i]+current);
            min=Math.min(min,current);
        }
        if(min==sum)
        return best;
        else
        return Math.max(best,sum-min);
    }
}