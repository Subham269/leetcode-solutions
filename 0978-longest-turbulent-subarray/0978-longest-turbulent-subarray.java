class Solution {
    public int maxTurbulenceSize(int[] arr) 
    {
        if(arr.length==0)
        return 0;
        if(arr.length==1)
        return 1;
        int up=1,down=1,max=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                up=down+1;
                down=1;
            }
            else if(arr[i]<arr[i+1])
            {
                down=up+1;
                up=1;
            }
            else
            {
                up=1;
                down=1;
            }
            max=Math.max(max,Math.max(up,down));
        }
        return max;
    }
}