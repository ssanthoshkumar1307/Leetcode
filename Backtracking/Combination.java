class Solution {
    ArrayList<List<Integer>>list=new ArrayList<>();
    ArrayList<Integer>slist=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
       combination(1,n,k);
       return list;
    }
    void combination(int start,int n,int k)
    {
        if(slist.size()==k)
        {
            list.add(new ArrayList<>(slist));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            slist.add(i);
            combination(i+1,n,k);
            slist.remove(slist.size()-1);
        }
    }
}