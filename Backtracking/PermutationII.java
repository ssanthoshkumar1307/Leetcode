class Solution {
    ArrayList<List<Integer>>list=new ArrayList<>();
    ArrayList<Integer>slist=new ArrayList<>();
    boolean visited[];
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        visited=new boolean[n];
        permutation(nums,n);
        return list;
    }
    void permutation(int nums[],int n)
    {
        if(slist.size()==n)
        {
            list.add(new ArrayList<>(slist));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(visited[i])continue;
            if(i>0&&nums[i]==nums[i-1]&&!visited[i-1])continue;
            visited[i]=true;
            slist.add(nums[i]);
            permutation(nums,n);
            slist.remove(slist.size()-1);
            visited[i]=false;
        }
    }
}