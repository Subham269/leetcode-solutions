class Solution {
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0,i,max=0;
        map.put(0,-1);
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            sum+=-1;
            else 
            sum+=1;
            if(map.containsKey(sum))
            {
                max=Math.max(max,i-map.get(sum));
            }
            else 
            map.put(sum,i);
        }
        return max;
    }
}