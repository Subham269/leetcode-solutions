class Solution {
    public boolean isPalindrome(String s) 
    {
        String nw="",wen="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                nw+=s.charAt(i);
                wen=s.charAt(i)+wen;
            }
                    
        }
        System.out.println(nw);
        System.out.println(wen);

        if(nw.equalsIgnoreCase(wen))
        return true;
        else
        return false;
}
}