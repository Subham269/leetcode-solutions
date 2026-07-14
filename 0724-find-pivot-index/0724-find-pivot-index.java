class Solution {
    public int pivotIndex(int[] nums) {
        int prefix[]=new int[nums.length];
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            prefix[i]=sum;
        }
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                if((prefix[n-1]-prefix[0])==0)
                return 0;
            }
            else if(prefix[i-1]==(prefix[n-1]-prefix[i]))
            return i;
        }
        return -1;
    }
}