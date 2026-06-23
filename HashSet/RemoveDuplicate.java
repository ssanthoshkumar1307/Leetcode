class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)nums[i]=0;
        int k=0;
        for(int x : set)
        {   nums[k]=x;
            k++;
        }
        return set.size();
    }
}