class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> map =new HashMap<>();
        int i;
        List<List<String>> fin=new ArrayList<>();
        for(i=0;i<strs.length;i++)
        {
            char[] caar=strs[i].toCharArray();
            Arrays.sort(caar);
            String key= new String(caar);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        for(List<String> value : map.values())
        {
            fin.add(value);
        }
        return fin;
    }
}