class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        Deque<Integer> dq=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        int left,right;
        for(right=0;right<nums.length;right++)
        {
            while(!dq.isEmpty() && dq.peekFirst() <= right-k)
            {
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[right])
            {
                dq.pollLast();
            }
            dq.addLast(right);
            if(right>=k-1)
            list.add(nums[dq.peekFirst()]);
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}