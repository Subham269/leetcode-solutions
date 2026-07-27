class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        return "";
        int left=0,right=0,min=Integer.MAX_VALUE;
        String mins="";
        int freq1[]=new int[128];
        int freq2[]=new int[128];
        for(int i=0;i<t.length();i++)
        {
            freq1[t.charAt(i)]++;
        }
        while(right<s.length())
        {
            freq2[s.charAt(right)]++;
            while(works(freq1,freq2))
            {
                if(min>right-left)
                {
                    min=right-left+1;
                    mins=s.substring(left,right+1);
                }
                freq2[s.charAt(left)]--;
                left++;
            }
            right++;
        }
        if(min==Integer.MAX_VALUE)
        return "";
        return mins;

    }
    public boolean works(int arr1[],int arr2[])
    {
        for(int i=0;i<128;i++)
        {
            if(arr2[i]<arr1[i])
            return false;
        }
        return true;
    }
}