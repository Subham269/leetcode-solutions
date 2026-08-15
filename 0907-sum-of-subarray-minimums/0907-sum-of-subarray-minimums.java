class Solution {
    public int sumSubarrayMins(int[] arr) 
    {
        int left,right,val,index;
        long count=0,MOD = 1_000_000_007L;;
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty()&&arr[i]<arr[stack.peek()])
            {
                index=stack.pop();
                right=i - index;
                val=arr[index];
                left=stack.isEmpty()?index+1:index-stack.peek();
                count=(count+(long)val*right*left)%MOD;
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            index=stack.pop();
            right=arr.length - index;
            val=arr[index];
            left=stack.isEmpty()?index+1:index-stack.peek();
            count=(count+(long)val*right*left)%MOD;
        }
        return (int)count;
    }
}