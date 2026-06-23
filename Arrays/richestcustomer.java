class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                sum+=accounts[i][j];
            }
            list.add(sum);
        }
        int max=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                max=list.get(i);
            }
        }
        return max;
    }
}