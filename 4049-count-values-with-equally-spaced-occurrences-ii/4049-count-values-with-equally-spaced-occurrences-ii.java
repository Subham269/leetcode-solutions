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
        for(int key : map.keySet())
        {
            List<Integer> value = map.get(key);
            if(value.size()>=3)
            {
                int n=(value.get(1)-value.get(0));
                int flag=0;
                for(int i=1;i<value.size()-1;i++)
                {
                    int curr=(value.get(i+1)-value.get(i));
                    if(n!=curr)
                    {
                        flag=1;
                        break;
                    }
                    n=curr;
                }
                if(flag==0)
                count++;
            }
        }
        return count;
    }
}