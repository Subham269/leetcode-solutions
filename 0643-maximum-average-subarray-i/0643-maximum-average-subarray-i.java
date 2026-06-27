class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int left=0,right=k-1,max,sum=0;
        for(int i=left;i<=right;i++)
        {
            sum+=nums[i];
        }
        max=sum;
        while(right<nums.length-1)
        {
            sum-=nums[left];
            left++;
            right++;
            sum+=nums[right];
            if(sum>=max)
            max=sum;
        }
        return (max/(double)k);    
    }
}