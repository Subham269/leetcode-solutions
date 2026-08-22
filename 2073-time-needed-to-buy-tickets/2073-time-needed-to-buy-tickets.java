class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        List<Integer> list=new ArrayList<>(); 
        int count=0;
        int i=0;
        for( int x: tickets)
        {
            list.add(x);
        }
            while(i<=list.size())
            {
                if(i==list.size())
                i=0;

                list.set(i,list.get(i)-1);
                count++;

                if(list.get(i)==0)
                {
                    list.remove(i);
                    if(i<k)
                    k--;
                    else if(i==k)
                    break;
                }
                else
                i++;
            }
        return count;
    }
}