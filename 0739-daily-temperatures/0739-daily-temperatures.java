class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack=new ArrayDeque<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--)
        {
            map.put(temperatures[i],i);
            while(!stack.isEmpty()&&temperatures[i]>=stack.peek())
            {
                stack.pop();
            }
            ans[i]=stack.isEmpty()?0:(map.get(stack.peek())-map.get(temperatures[i]));
            stack.push(temperatures[i]);
        }
        return ans;
    }
}