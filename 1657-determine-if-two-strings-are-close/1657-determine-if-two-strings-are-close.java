class Solution {
    public boolean closeStrings(String word1, String word2) 
    {
        if(word1.equals(word2))
        return true;
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for(int i=0;i<word1.length();i++)
        {
            freq1[word1.charAt(i)-97]++;
        }
        for(int i=0;i<word2.length();i++)
        {
            freq2[word2.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++)
        {
            if((freq1[i]==0&&freq2[i]>=1)||(freq2[i]==0&&freq1[i]>=1))
            return false;
            if(freq1[i]>0)
            list1.add(freq1[i]);
            if(freq2[i]>0)
            list2.add(freq2[i]);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.equals(list2))
        return true;
        else
        return false;
    }
}