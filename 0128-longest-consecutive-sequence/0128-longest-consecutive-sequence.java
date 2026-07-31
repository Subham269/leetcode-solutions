class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set=new HashSet<>();
        int len=1,max=0,k;
        for(int num: nums)
        {
            set.add(num);
        }
        for(int i: set)
        {
            if(!set.contains(i-1))
            {
                k=i;
                while(set.contains(k+1))
                {
                    len++;
                    k++;
                }
                max=Math.max(max,len);
                len=1;
            }
        }
        return max;
    }
}