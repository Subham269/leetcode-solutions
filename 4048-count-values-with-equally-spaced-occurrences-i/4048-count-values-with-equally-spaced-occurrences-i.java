class Solution {
    public int countSpecialIntegers(int[] nums) 
    {
        HashMap <Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list= new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            list = new ArrayList<>();
            if(!map.containsKey(nums[i]))
            {
                list.add(i);
                map.put(nums[i],list);
            }
            else
            {
                map.get(nums[i]).add(i);
            }
        }
        for(List<Integer> value : map.values())
        {
            if(value.size()==3)
            {
                if((value.get(1)-value.get(0))==(value.get(2)-value.get(1)))
                count++;
            }
        }
        return count;
    }
}