class Solution {
    public int mySqrt(int x) 
    {
        if(x==0)
        return 0;
        if(x==1)
        return 1;
        int left=0,right=x,mid;
        while(left<=right)
        {
            mid=(right+left)/2;
            if(mid==x/mid)
            return mid;
            else if(mid>x/mid)
            right=mid-1;
            else 
            left=mid+1;
        }
        return right;
    }
}