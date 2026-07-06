class Solution {
    public String minWindow(String s, String t) 
    {
        if(t.length()>s.length())
        return "";
        int left=0,right=t.length()-1,i,min=Integer.MAX_VALUE,flag=0;
        String mins="";
        int arr1[]=new int[256];
        int arr2[]=new int[256];
        for(i=0;i<t.length();i++)
        {
            arr1[t.charAt(i)]++;
        }
        for(i=left;i<=right;i++)
        {
            arr2[s.charAt(i)]++;
        }
        while(right<s.length())
        {
            for(i=0;i<256;i++)
            {
                if(arr2[i]<arr1[i])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                right++;
                if(right<=s.length()-1)
                arr2[s.charAt(right)]++;
            }
            else
            {
                if(right-left+1<min)
                {
                    min=right-left+1;
                    mins=s.substring(left,right+1);
                }
                arr2[s.charAt(left)]--;
                left++;
            }
            flag=0;
        }
        return mins;
        
    }
}