class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        if(s.length()<p.length())
        return Collections.emptyList();
        List<Integer> fin=new ArrayList<>();
        int arr1[]=new int[128];
        int arr2[]=new int[128];
        int left=0,right=p.length()-1;
        for(int i=0;i<p.length();i++)
        {
            arr2[p.charAt(i)]++;
            arr1[s.charAt(i)]++;
        }
        while(right<s.length())
        {
            if(Arrays.equals(arr1,arr2))
            fin.add(left);
                arr1[s.charAt(left)]--;
                left++;
                right++;
                if(right!=s.length())
                arr1[s.charAt(right)]++;
        }
        return fin;
    }
}