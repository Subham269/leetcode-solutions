class Solution {
    public int largestRectangleArea(int[] heights) 
    {
        int rightbound=0,leftbound=0,len,height,max=0;
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<heights.length;i++)
        {
            while(!stack.isEmpty()&&heights[i]<heights[stack.peek()])
            {
                rightbound=i;
                height=heights[stack.peek()];
                stack.pop();
                leftbound=stack.isEmpty()?-1:stack.peek();
                len=rightbound-leftbound-1;
                max=Math.max(max,height*len);
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            height=heights[stack.peek()];
            stack.pop();
            leftbound=stack.isEmpty()?-1:stack.peek();
            len=heights.length-leftbound-1;
            max=Math.max(max,height*len);
        }
        return max;
    }
}