class Solution {
    public String minWindow(String s, String t) 
    {
        if(t.length()>s.length())
        return "";
        int left=0,right=t.length(),i,min=Integer.MAX_VALUE,flag=0;
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        String mins="";
        for(i=0;i<t.length();i++)
        {
            freq1[t.charAt(i)]++;
        }
        for(i=0;i<t.length();i++)
        {
            freq2[s.charAt(i)]++;
        }
        while(right<=s.length())
        {
            flag=0;
            for(i=0;i<256;i++)
            {
                if(freq2[i]<freq1[i])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                if(right<s.length())
                freq2[s.charAt(right)]++;
                right++;
            }
            else
            {
                if(right-left<min)
                {
                    min=right-left;
                    mins=s.substring(left,right);
                }
                freq2[s.charAt(left)]--;
                left++;

            }
        }
        if(min==Integer.MAX_VALUE)
        return "";
        else
        return mins;
    }
}