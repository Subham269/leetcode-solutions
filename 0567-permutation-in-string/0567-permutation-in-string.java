class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s1.length()>s2.length())
        return false;
        int left=0,right=s1.length()-1,i;
        int freq1[]=new int[128];
        int freq2[]=new int[128];
        for(i=0;i<=right;i++)
        {
            freq1[s1.charAt(i)]++;
        }
        for(i=0;i<=right;i++)
        {
            freq2[s2.charAt(i)]++;
        }
        while(!Arrays.equals(freq1,freq2))
        {
            if(right==s2.length()-1)
            break;
            freq2[s2.charAt(left)]--;
            left++;
            right++;
            freq2[s2.charAt(right)]++;
        }
        if(Arrays.equals(freq1,freq2))
        return true;
        else 
        return false;
    }
}