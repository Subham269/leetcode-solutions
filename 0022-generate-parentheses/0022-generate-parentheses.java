class Solution {
    List<String> list= new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        combi(0,0,sb,n);
        return list;
    }
    public void combi(int open,int closed,StringBuilder sb,int n)
    {
        if(sb.length()==2*n)
        {
            list.add(sb.toString());
            return ;
        }
        else
        {
            if(open<n)
            {
                sb.append('(');
                combi(open+1,closed,sb,n);
                sb.deleteCharAt(sb.length()-1);
            }
            if(closed<open)
            {
                sb.append(')');
                combi(open,closed+1,sb,n);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}