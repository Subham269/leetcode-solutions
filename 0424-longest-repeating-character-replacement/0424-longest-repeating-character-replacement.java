class Solution {
    public int characterReplacement(String s, int k) 
    {
        int left=0,right=0,max=0,maxLen=0,i;
        int freq[]=new int[26];
        while(right<=s.length()-1)
        {
            freq[s.charAt(right)-65]++;
            right++;
            for(i=0;i<26;i++)
            {
                if(freq[i]>max)
                max=freq[i];
            }
            while((right-left)-max>k)
            {
                freq[s.charAt(left)-65]--;
                left++;
                for(i=0;i<26;i++)
                {
                    if(freq[i]>max)
                    max=freq[i];
                }
            }
            maxLen=Math.max(maxLen,right-left);
        }
        return maxLen;
    }
}