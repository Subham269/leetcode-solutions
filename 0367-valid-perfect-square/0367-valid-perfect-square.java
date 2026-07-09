class Solution {
    public boolean isPerfectSquare(int num) 
    {
        if(num==0||num==1)
        return true;
        int left=0,right=num,mid;
        long square;
        while(left<=right)
        {
            mid=(left+right)/2;
            square=mid*mid;
            if(square==num)
            return true;
            else if(mid>num/mid)
            right=mid-1;
            else 
            left=mid+1;
        }
        return false;
    }
}