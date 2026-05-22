class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        List<List<Integer>> arr=new ArrayList<>();    
        int left,right,i,j;
        long sum=0;
        Arrays.sort(nums);
        for(i=0;i<nums.length-3;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
            continue;
            for(j=i+1;j<nums.length-2;j++)
            {
                if(j>i+1&&nums[j]==nums[j-1])
                continue;
                left=j+1;
                right=nums.length-1;
                sum=0;
                while(left<right)
                {
                    sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target)
                    {
                        List<Integer> arr1=new ArrayList<>();
                        arr1.add(nums[i]);
                        arr1.add(nums[j]);
                        arr1.add(nums[left]);
                        arr1.add(nums[right]);
                        arr.add(arr1);

                        left++;
                        right--;
                        while(left<right&&nums[left]==nums[left-1])
                        left++;
                        while(left<right&&right!=nums.length-1&&nums[right]==nums[right+1])
                        right++;
                    }
                    else if(sum<target)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }
            }
        }
        return arr;
    }
}