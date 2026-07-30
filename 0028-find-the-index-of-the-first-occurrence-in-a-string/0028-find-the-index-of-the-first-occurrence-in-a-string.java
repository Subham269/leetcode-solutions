class Solution {
    public int strStr(String haystack, String needle) 
    {
        int hay=0,need=0;
        int lps[]=buildLPS(needle);
        while(hay<haystack.length())
        {
            if(haystack.charAt(hay)==needle.charAt(need))
            {
                hay++;
                need++;
                if(need==needle.length())
                return hay-need;
            }
            else if(need!=0)
            {
                need=lps[need-1];
            }
            else
            {
                hay++;
            }
        }
        return -1;
    }
    private int[] buildLPS(String pattern)
    {
        int len=0,i=1;
        int LPS[]=new int[pattern.length()];
        while(i<pattern.length())
        {
            if(pattern.charAt(len)==pattern.charAt(i))
            {
                len++;
                LPS[i]=len;
                i++;
            }
            else if(len!=0)
                len=LPS[len-1];
            else
                {
                    LPS[i]=0;
                    i++;
                }
        }
        return LPS;
    }
}