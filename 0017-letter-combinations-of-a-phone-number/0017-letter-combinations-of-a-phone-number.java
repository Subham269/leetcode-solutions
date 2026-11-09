class Solution {
    String[] comb= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> list=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        
        combi(0,"",digits);
        return list;


    }
    public void combi(int index,String fin,String digits)
    {
        if(fin.length()==digits.length())
        {
            list.add(fin);
            return;
        }
        for(int i=0;i<comb[(int)digits.charAt(index)-50].length();i++)
        {
            String temp =fin + comb[(int)digits.charAt(index)-50].charAt(i);
            combi(index+1,temp,digits);
        }
    }
}