class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        List<Integer> arr3=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            arr1.add(nums[i]);
            else if(nums[i]==pivot)
            arr2.add(nums[i]);
            else
            arr3.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i<arr1.size())
            nums[i]=arr1.get(i);
            else if(i>=arr1.size()&&i<(arr1.size()+arr2.size()))
            nums[i]=arr2.get(i-arr1.size());
            else
            nums[i]=arr3.get(i-arr1.size()-arr2.size());
        }
        return nums;
    }
}