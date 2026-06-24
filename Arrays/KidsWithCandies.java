class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        ArrayList<Boolean>list=new ArrayList<>();
        int arr[]=new int[n];
        for(int t=0;t<n;t++)
        {
            arr[t]=candies[t];
        }
        for(int i=0;i<n;i++)
        {
            int count=0;
            candies[i]+=extraCandies;
            for(int j=0;j<n;j++)
            {
                if(candies[i]>=arr[j])
                {
                    count++;
                }
            }
            if(count==n)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
            
        }
        return list;
    }
}