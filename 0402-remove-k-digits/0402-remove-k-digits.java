class Solution 
{
    public String removeKdigits(String num, int k) 
    {
        if(k==0)
        return num;
        if(num.length()==1)
        return "0";

        if(k>=num.length())
        return "0";
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<num.length();i++)
        {
            while(!stack.isEmpty()&&(stack.peek()>(num.charAt(i)-48))&&k>0)
            {
                stack.pop();
                k--;
            }
            stack.push((num.charAt(i)-48));
        }
        while(k!=0)
        {
            stack.removeFirst();
            k--;
        }
        StringBuilder result=new StringBuilder();
        Iterator<Integer> it=stack.descendingIterator();
        while(it.hasNext())
        {
            result.append(it.next());
        }
        int i=0;
        while(i<result.length()-1&&result.charAt(i)=='0')
        i++;
        return result.substring(i);
    }
}