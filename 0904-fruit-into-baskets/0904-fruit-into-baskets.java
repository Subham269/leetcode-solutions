class Solution {
    public int totalFruit(int[] fruits) 
    {
        HashMap<Integer, Integer> freq= new HashMap<>();
        int left=0,right=0,max=0,len=0;
        while(right<fruits.length)
        {
                freq.put(fruits[right],freq.getOrDefault(fruits[right],0)+1);
                while(freq.size()>2)
                {
                    if(freq.get(fruits[left])==1)
                    freq.remove(fruits[left]);
                    else
                    freq.put(fruits[left],freq.get(fruits[left])-1);
                    left++;
                }
                max=Math.max(max,right-left+1);
                right++;
        }
        return max;    }
}