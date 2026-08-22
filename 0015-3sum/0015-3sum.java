class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> arr=new ArrayList<>();
        
        int left,right,i,sum=0;
        Arrays.sort(nums);
        for(i=0;i<nums.length-2;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
            continue;
            left=i+1;
            right=nums.length-1;
            while(left<right)
            {
                sum=nums[i]+nums[left]+nums[right];
                if(sum==0)
                {
                    List<Integer> arr1=new ArrayList<>();
                    arr1.add(nums[i]);
                    arr1.add(nums[left]);
                    arr1.add(nums[right]);
                    arr.add(arr1);
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left-1])
                    left++;
                    while(left<right&&nums[right]==nums[right+1])
                    right--;
                }
                else if(sum<0)
                left++;
                else
                right--;
            }
        }
        return arr;
    }
}