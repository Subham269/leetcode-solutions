class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
            int left=0,right=0,max=0,size=0;
            int freq[]=new int[128];
            while(right<s.length())
            {
                if(freq[s.charAt(right)]==1)
                {
                    freq[s.charAt(left)]--;
                    left++;
                }
                else
                {
                    freq[s.charAt(right)]++;
                    size=right-left+1;
                    right++;
                    max=Math.max(max,size);
                }
            }
            return max;
    }
}