class Solution {
    public int maximalRectangle(char[][] matrix) 
    {
        int[] heights= new int[matrix[0].length];
        int rightbound,leftbound,max=0,len,height;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='1')
                heights[j]+=1;
                else 
                heights[j]=0;
            }
            Deque<Integer> stack=new ArrayDeque<>();
            for(int j=0;j<heights.length;j++)
            {
                while(!stack.isEmpty()&&heights[j]<heights[stack.peek()])
                {
                    rightbound=j;
                    height=heights[stack.peek()];
                    stack.pop();
                    leftbound=stack.isEmpty()?-1:stack.peek();
                    len=rightbound - leftbound - 1;
                    max=Math.max(max,len*height);
                }
                stack.push(j);
            }
            while(!stack.isEmpty())
            {
                height=heights[stack.peek()];
                stack.pop();
                leftbound=stack.isEmpty()?-1:stack.peek();
                len=heights.length-leftbound-1;
                max=Math.max(max,len*height);
            }
        }
        return max;
    }
}