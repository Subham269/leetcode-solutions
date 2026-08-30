class Solution {
    public int orangesRotting(int[][] grid) 
    {
        int minutes=0,fresh=0,row,col,i,j;
        Queue<int[]> queue=new LinkedList<>();
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                queue.add(new int[] {i,j});
                else if(grid[i][j]==1)
                fresh++;
            }
        }
            while(!queue.isEmpty()&&fresh>0)
            {
                int size=queue.size();
                for(i=0;i<size;i++)
                {
                    int curr[]=queue.poll();
                    row=curr[0];
                    col=curr[1];
                    if(row+1<grid.length && grid[row+1][col]==1)
                    {
                        queue.add(new int[] {row+1,col});
                        fresh--;
                        grid[row+1][col]=2;
                    }
                     if(row-1>=0 && grid[row-1][col]==1)
                    {
                        queue.add(new int[] {row-1,col});
                        fresh--;
                        grid[row-1][col]=2;
                    }
                    if(col+1<grid[0].length && grid[row][col+1]==1)
                    {
                        queue.add(new int[] {row,col+1});
                        fresh--;
                        grid[row][col+1]=2;
                    }
                    if(col-1>=0 && grid[row][col-1]==1)
                    {
                        queue.add(new int[] {row,col-1});
                        fresh--;
                        grid[row][col-1]=2;
                    }


                }
                minutes++;
            }
        return ((fresh==0)?minutes:-1);
    }
}