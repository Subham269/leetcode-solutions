class Solution {
    public int[] resultArray(int[] nums) 
    {
        Deque<Integer> que1=new ArrayDeque<>();
        Deque<Integer> que2=new ArrayDeque<>();
        int[] result=new int[nums.length];
        int a=0;
        que1.addLast(nums[0]);
        que2.addLast(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(que1.peekLast()>que2.peekLast())
            que1.addLast(nums[i]);
            else 
            que2.addLast(nums[i]);
        }
        while(!que1.isEmpty())
        result[a++]=que1.removeFirst();
        while(!que2.isEmpty())
        result[a++]=que2.removeFirst();
        return result;
    }
}