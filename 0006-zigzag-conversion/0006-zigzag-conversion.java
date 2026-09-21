class Solution {
    public String convert(String s, int numRows) 
    {
        if(s.length()==1||s.length()==0||s.length()<numRows||numRows==1)
        return s;
        int row=0,col=0,index=0,i,j;
        boolean down=true,diagonal=false;;
        char arr[][]=new char[numRows][s.length()];
        while(index<s.length())
        {
            arr[row][col]=s.charAt(index++);
            if(down)
            {
                if(row==numRows-1)
                {
                    down=false;
                    diagonal=true;
                    row--;
                    col++;
                }
                else 
                {
                    row++;
                }
            }
            else if(diagonal)
            {
                if(row==0)
                {
                    diagonal=false;
                    down=true;
                    row++;
                }
                else
                {
                    row--;
                    col++;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(i=0;i<numRows;i++)
        {
            for(j=0;j<s.length();j++)
            {
                if(arr[i][j]!='\u0000')
                sb.append(arr[i][j]);
            }
        }
        return sb.toString(); 
    }
}