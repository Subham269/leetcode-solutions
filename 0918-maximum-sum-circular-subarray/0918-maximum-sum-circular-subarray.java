class Solution {
    public int maxSubarraySumCircular(int[] nums) 
    {
        int best=nums[0],current1=nums[0],current2=nums[0],min=nums[0],sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            current1=Math.max(nums[i],nums[i]+current1);
            best=Math.max(best,current1);
            current2=Math.min(nums[i],nums[i]+current2);
            min=Math.min(min,current2);
        }
        if(min==sum)
        return best;
        else
        return Math.max(best,sum-min);
    }
}