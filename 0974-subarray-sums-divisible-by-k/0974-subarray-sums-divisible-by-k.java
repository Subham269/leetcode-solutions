class Solution {
    public int subarraysDivByK(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0,i,rem,freq=0;
        map.put(0,1);
        for(i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            rem=((sum%k)+k)%k;
            if(map.containsKey(rem))
            freq+=map.get(rem);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return freq;
    }
}