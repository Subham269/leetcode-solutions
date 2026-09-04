class Solution {
    public int longestSubarray(int[] nums, int limit) 
    {
        Deque<Integer> minque=new ArrayDeque<>();
        Deque<Integer> maxque=new ArrayDeque<>();
        int left=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            while(!minque.isEmpty()&&nums[i]<=nums[minque.peekLast()])
            minque.pollLast();
            while(!maxque.isEmpty()&&nums[i]>=nums[maxque.peekLast()])
            maxque.pollLast();
            maxque.addLast(i);
            minque.addLast(i);
            while(nums[maxque.peekFirst()]-nums[minque.peekFirst()]>limit)
            {
                if(maxque.peek()==left)
                maxque.pop();
                if(minque.peek()==left)
                minque.pop();
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}