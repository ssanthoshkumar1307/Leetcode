class Solution {
    ArrayList<List<Integer>>list=new ArrayList<>();
    ArrayList<Integer>slist=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        for(int k=0;k<=nums.length;k++)combination(0,k,nums.length,nums);
        return list;
    }
    void combination(int start,int k,int n,int nums[])
    {
        if(slist.size()==k)
        {
            list.add(new ArrayList<>(slist));
            return;
        }
        for(int i=start;i<n;i++)
        {
            slist.add(nums[i]);
            combination(i+1,k,n,nums);
            slist.remove(slist.size()-1);
        }
    }
}