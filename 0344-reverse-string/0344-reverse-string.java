class Solution {
    public void reverseString(char[] s) 
    {
        char t;
        int n=s.length;
        for(int i=0;i<s.length/2;i++)
        {
            t=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=t;
        }
    }
}