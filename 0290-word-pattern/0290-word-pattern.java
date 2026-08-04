class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String[] nw=s.split(" ");
        if(nw.length!=pattern.length())
        return false;
        HashMap<Character,String> map1= new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        int i=0;
        for(String word: nw)
        {
            if(map1.containsKey(pattern.charAt(i)))
            {
                if(!map1.get(pattern.charAt(i)).equals(word))
                return false;
            }
            if(map2.containsKey(word))
            {
                if(map2.get(word)!=pattern.charAt(i))
                return false;
            }
            map1.put(pattern.charAt(i),word);
            map2.put(word,pattern.charAt(i));
            i++;
        }
        return true;
    }
}