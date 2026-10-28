class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            prefix[i]=sum;
        }
        if(prefix[nums.length-1]==nums[0])
            return 0;
        
        for(int i=1;i<nums.length-1;i++)
        {
            if(prefix[i-1]==(prefix[nums.length-1]-prefix[i]))
            return i;
        }
        if(nums.length!=1)
        {
             
           if(prefix[nums.length-2]==0)
            return nums.length-1; 
        }
        return -1;
    }
}