class Solution {
    public int characterReplacement(String s, int k) 
    {
        int left=0,right=0,maxo=0,i,max=0;
        int arr[]=new int[26];
        while(right<s.length())
        {
            arr[s.charAt(right)-65]++;
            for(i=0;i<arr.length;i++)
                {
                    if(arr[i]>max)
                    max=arr[i];
                }
            while((s.substring(left,right+1).length()-max)>k)
            {
                arr[s.charAt(left)-65]--;
                left++;
                for(i=0;i<arr.length;i++)
                {
                    if(arr[i]>max)
                    max=arr[i];
                }
            }
            maxo=Math.max(maxo,right-left+1);
            right++;
        }
        return maxo;
    }
}