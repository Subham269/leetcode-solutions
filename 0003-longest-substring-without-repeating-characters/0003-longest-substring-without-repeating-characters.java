class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,max=0;
        int freq[]=new int[256];
        while(right<s.length())
        {
            while(freq[s.charAt(right)]==1)
            {
                freq[s.charAt(left)]--;
                left++;
            }
            freq[s.charAt(right)]++;
            max=Math.max(max,right-left+1);
            right++;
            
        }
        return max;
    }
}