class Solution {
    String s="";
    public String findDifferentBinaryString(String[] nums) {
        boolean b=combi(nums[0].length(),new StringBuilder(""),Arrays.asList(nums));
        return s;
    }
    public boolean combi(int n,StringBuilder st,List<String> str)
    {
        if(st.length()==n)
        {
            if(!str.contains(st.toString()))
            {
                s=st.toString();
                return true;
            }
            return false;
        }
        else
        {
            st.append('0');
            if(combi(n,st,str))
            return true;
            st.setLength(st.length()-1);
            st.append('1');
            if(combi(n,st,str))
            return true;
            st.setLength(st.length()-1);
        }

        return false;
    }
}