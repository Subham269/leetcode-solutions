class Solution {
    public int absDifference(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int suma=0,summ=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<k)
            suma+=nums[i];
            if(nums.length-i<=k)
            summ+=nums[i];
        }
        return Math.abs(summ-suma);
    }
}