class Solution {
    public int firstStableIndex(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> Integer.compare(nums[a],nums[b]));
        int max=Integer.MIN_VALUE,flag=0,min,i;
        for(i=0;i<nums.length;i++)
        {
            pq.add(i);
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            max=nums[i];
            min=nums[pq.peek()];
            if((max-min)<=k)
            {
                flag=1;
                break;
            }
            pq.remove(i);
        }
        if(flag==1)
        return i;
        else 
        return -1;
    }
}