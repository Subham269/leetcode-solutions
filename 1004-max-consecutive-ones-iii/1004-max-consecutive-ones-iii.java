class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int left=0,right=0,freq=0,max=0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            freq++;
            while(freq>k)
            {
                if(nums[left]==0)
                freq--;
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}