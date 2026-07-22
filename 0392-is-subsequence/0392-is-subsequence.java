class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int slow=0,fast=0;
        for(fast=0;fast<t.length();fast++)
        {
            if(slow<s.length()&&s.charAt(slow)==t.charAt(fast))
            slow++;
        }
        if(slow==s.length())
        return true;
        else
        return false;
    }
}