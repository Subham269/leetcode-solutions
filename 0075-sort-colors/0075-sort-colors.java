class Solution {
    public void sortColors(int[] nums) 
    {
        int right=nums.length-1,left=0,t,i=0;
        while(i<=right)
        {
            if(nums[i]==0)
            {
                t=nums[i];
                nums[i]=nums[left];
                nums[left]=t;
                left++;
                i++;
            }
            else if(nums[i]==2)
            {
                t=nums[i];
                nums[i]=nums[right];
                nums[right]=t;
                right--;
            }
            else
            i++;
        }
    }
}