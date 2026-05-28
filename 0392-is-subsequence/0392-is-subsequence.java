class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int slow=0;
        for(int fast=0;fast<t.length();fast++)
        {
            if(slow<s.length()&&s.charAt(slow)==t.charAt(fast))
            {
                slow++;
            }
        }
        return slow==s.length();
    }
}