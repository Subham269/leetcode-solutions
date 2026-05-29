class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        int slow1=0,slow2=0;
        char s1[]=new char[s.length()];
        char s2[]=new char[t.length()];
        for(int fast=0;fast<s.length();fast++)
        {
            if(s.charAt(fast)=='#')
            {
                if(slow1>0)
                slow1--;
            }
            else
            s1[slow1++]=s.charAt(fast);
        }
        for(int fast=0;fast<t.length();fast++)
        {
            if(t.charAt(fast)=='#')
            {
                if(slow2>0)
                slow2--;
            }
            else
            s2[slow2++]=t.charAt(fast);
        }
        if(slow1!=slow2)
        return false;
        else
        {
            for(int i=0;i<slow1;i++)
            {
                if(s1[i]!=s2[i])
                return false;
            }
            return true;
        }
    }
}