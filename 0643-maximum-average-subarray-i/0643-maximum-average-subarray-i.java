class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int left=0,right=k-1;
        double max=0.0,sum=0.0;
        for(int i=left;i<=right;i++)
            {
                sum+=nums[i];
            }
            max=sum;
        while(right<nums.length)
        {
            if(right+1<nums.length)
            {
            sum-=nums[left];
            left++;
            right++;
            sum+=nums[right];
            if(max<sum)
            max=sum;
            }
            else
            break;
        }
        return (max/k);
    }
}