class Solution {
    public int getMaxLen(int[] nums) 
    {
        int oldPos,oldNeg,pos=0,neg=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos=pos+1;
                neg=(neg==0)?0:neg+1;
            }
            else if(nums[i]<0)
            {
                oldPos=pos;
                oldNeg=neg;
                pos=(oldNeg==0)?0:neg+1;
                neg=oldPos+1;
            }
            else
            {
                pos=0;
                neg=0;
            }
            max=Math.max(max,pos);
        }
        return max;
    }
}