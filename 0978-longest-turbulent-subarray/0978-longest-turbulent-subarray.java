class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length==0)
        return 0;
        int len=0,ans=1,currcmp,prevcmp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            currcmp=-1;
            else if(arr[i]>arr[i+1])
            currcmp=1;
            else 
            currcmp=0;

            if(prevcmp*currcmp==-1)
            len++;
            else if(prevcmp*currcmp==1)
            len=2;
            else if(currcmp==0)
            len=1;
            else if(prevcmp==0&&currcmp!=0)
            len=2;
            prevcmp=currcmp;
            ans=Math.max(ans,len);
        }
        return ans;
    }
}