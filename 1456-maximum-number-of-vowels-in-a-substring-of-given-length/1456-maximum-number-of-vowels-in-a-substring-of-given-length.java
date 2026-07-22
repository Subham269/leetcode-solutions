class Solution {
    public int maxVowels(String s, int k) 
    {
        int left=0,right=k-1,vow=0,max=0;
        for(int i=left;i<=right;i++)
        {
            if("aeiou".indexOf(s.charAt(i))!=-1)
            vow++;
        }
        max=vow;
        while(right<s.length()-1)
        {
            if("aeiou".indexOf(s.charAt(left))!=-1)
            vow--;
            left++;
            right++;
            if("aeiou".indexOf(s.charAt(right))!=-1)
            vow++;
            max=Math.max(max,vow);
        }
        return max;
    }
}