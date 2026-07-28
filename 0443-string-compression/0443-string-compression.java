class Solution {
    public int compress(char[] chars) 
    {
        if(chars.length==1)
        return 1;
        int slow=0,fast=0,count=0,j=0;
        String cnt="";
        while(fast<chars.length)
        {
            while(j<chars.length&&chars[fast]==chars[j])
            {
                count++;
                j++;
            }
            
            chars[slow++]=chars[fast];
            if(count>1)
            {
                cnt=Integer.toString(count);
                for(char c: cnt.toCharArray())
                {
                    chars[slow++]=c;
                }
            }
            count=0;
            fast=j;
        }
        return slow;
    }
}