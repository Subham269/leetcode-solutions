class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        if(p.length()>s.length())
        return new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int freq1[]=new int[128];
        int freq2[]=new int[128];
        int left=0,right=p.length()-1;
        for(int i=0;i<=right;i++)
        {
            freq1[s.charAt(i)]++;
            freq2[p.charAt(i)]++;
        }
        if(Arrays.equals(freq1,freq2))
        list.add(left);
        while(right<s.length()-1)
        {
            freq1[s.charAt(left)]--;
            left++;
            right++;
            freq1[s.charAt(right)]++;
            if(Arrays.equals(freq1,freq2))
            list.add(left);
        }
        return list;
    }
}