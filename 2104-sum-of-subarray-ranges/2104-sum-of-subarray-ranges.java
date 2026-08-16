class Solution {
    public long subArrayRanges(int[] nums) 
    {
        Deque<Integer> stack=new ArrayDeque<>();
        int right,left,index,val;
        long count_min=0,count_max=0;
        for(int i=0;i<nums.length;i++)
        {
            while(!stack.isEmpty()&&nums[i]<nums[stack.peek()])
            {
                index=stack.pop();
                right=i-index;
                val=nums[index];
                left=stack.isEmpty()?index+1:index-stack.peek();
                count_min=count_min+(long)val*right*left;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            index=stack.pop();
            right=nums.length-index;
            val=nums[index];
            left=stack.isEmpty()?index+1:index-stack.peek();
            count_min=count_min+(long)val*right*left;
        }

        
        for(int i=0;i<nums.length;i++)
        {
            while(!stack.isEmpty()&&nums[i]>nums[stack.peek()])
            {
                index=stack.pop();
                right=i-index;
                val=nums[index];
                left=stack.isEmpty()?index+1:index-stack.peek();
                count_max=count_max+(long)val*right*left;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            index=stack.pop();
            right=nums.length-index;
            val=nums[index];
            left=stack.isEmpty()?index+1:index-stack.peek();
            count_max=count_max+(long)val*right*left;
        }
        return (count_max-count_min);
    }
}