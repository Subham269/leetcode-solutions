class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s1.length()>s2.length())
        return false;
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        int left=0,right=s1.length()-1;
        for(int i=0;i<=right;i++)
        {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        if(Arrays.equals(freq1,freq2))
        return true;
        while(right<s2.length()-1)
        {
            freq2[s2.charAt(left)]--;
            left++;
            right++;
            freq2[s2.charAt(right)]++;
            if(Arrays.equals(freq1,freq2))
            return true;
        }
        return false;
    }
}