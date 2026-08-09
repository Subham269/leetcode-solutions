class Solution {
    public int[] finalPrices(int[] prices) 
    {
        Deque<Integer> stack=new ArrayDeque<>();
        int answer[]=new int[prices.length];
        for(int i=prices.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&prices[i]<stack.peek())
            {
                stack.pop();
            }
            answer[i]=stack.isEmpty()?prices[i]:(prices[i]-stack.peek());
            stack.push(prices[i]);
        }
        return answer;
    }
}