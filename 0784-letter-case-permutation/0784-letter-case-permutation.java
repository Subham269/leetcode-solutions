class Solution {
    List<String> fin= new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        combi(new StringBuilder(s),0,s.length());
        return fin;
    }
    public void combi(StringBuilder st,int index,int n)
    {
        if(index==n)
        {
            fin.add(st.toString());
            return;
        }
        else
        {
            char ch=st.charAt(index);
            if(Character.isLetter(ch))
            {
                st.setCharAt(index,Character.toLowerCase(ch));
                combi(st,index+1,n);
                st.setCharAt(index,Character.toUpperCase(ch));
                combi(st,index+1,n);
            }
            else
            {
                combi(st,index+1,n);
            }
        }
    }
}