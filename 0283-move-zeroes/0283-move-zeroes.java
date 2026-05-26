class Solution {
    public void moveZeroes(int[] nums) 
    {
        int slow=0,fast;
        for(fast=0;fast<nums.length;fast++)
        {
            if(nums[fast]!=0)
            {
                nums[slow++]=nums[fast];
            }
        }
        for(fast=slow;fast<nums.length;fast++)
        {
            nums[fast]=0;
        }
    }
}