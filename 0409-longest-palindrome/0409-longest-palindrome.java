class Solution {
    public int longestPalindrome(String s) {
        int freq[]=new int[123];
        int sum=0,found=0;
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<123;i++)
        {
            if(freq[i]!=0)
            {
                if(freq[i]%2==0)
                sum+=freq[i]; 
                else
                {
                    found=1;
                    if(freq[i]>1)
                    sum+=freq[i]-1;
                    

                }
            }
            

        }
        
        return found==1?sum+1:sum;
    }
}