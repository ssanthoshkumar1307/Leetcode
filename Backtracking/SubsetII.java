class Solution {
    ArrayList<List<Integer>>list=new ArrayList<>();
    ArrayList<Integer>slist=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        for(int k=0;k<=nums.length;k++)combination(0,k,nums);
        return list;
    }
    void combination(int start,int k,int nums[])
    {
        if(slist.size()==k)
        {
            list.add(new ArrayList<>(slist));
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
        if(i>start&&nums[i]==nums[i-1])continue;
            slist.add(nums[i]);
            combination(i+1,k,nums);
            slist.remove(slist.size()-1);
        }
    }
}