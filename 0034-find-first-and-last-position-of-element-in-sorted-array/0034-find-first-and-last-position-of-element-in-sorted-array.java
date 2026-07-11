class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        if(nums.length==0)
        return new int[]{-1,-1};
        int arr[]=new int[2];
        int left=0,right=nums.length-1,mid,flag=0;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                arr[0]=mid;
                right=mid-1;
                flag=1;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else 
            left=mid+1;
        }
        if(flag==0)
        return new int[]{-1,-1};
        left=0;
        right=nums.length-1;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                arr[1]=mid;
                left=mid+1;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else 
            left=mid+1;
        }
        return arr;
    }
}