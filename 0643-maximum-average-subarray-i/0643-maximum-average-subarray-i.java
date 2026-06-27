class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int left=0,right=k-1,i,max=Integer.MIN_VALUE,sum=0;
        while(right<nums.length)
        {
            for(i=left;i<=right;i++)
            {
                sum+=nums[i];
            }
            if(sum>=max)
            max=sum;
            sum=0;
            left++;
            right++;
        }
        return (max/(double)k);    
    }
}