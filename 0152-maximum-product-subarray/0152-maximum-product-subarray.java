class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding=nums[0],minEnding=nums[0],a1,a2,best=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            a1=maxEnding*nums[i];
            a2=minEnding*nums[i];
            maxEnding=Math.max(nums[i],Math.max(a1,a2));
            minEnding=Math.min(nums[i],Math.min(a1,a2));
            best=Math.max(best,maxEnding);
        }
        return best;
    }
}