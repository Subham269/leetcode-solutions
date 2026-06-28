class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
            int left=0,right=0,i,max=0,size=0,flag=0;
            while(right<s.length())
            {
                int freq[]=new int[128];
                for(i=left;i<=right;i++)
                {
                    if(freq[s.charAt(i)]>0)
                    {
                        flag=1;
                        break;
                    }
                    freq[s.charAt(i)]++;
                }
                if(flag==0)
                {
                    size=right-left+1;
                    max=Math.max(max,size);
                    right++;
                }
                else
                {
                    left++;
                    right++;
                    flag=0;
                }
            }
            return max;
    }
}