class Solution {
    public int subarraySum(int[] nums, int k) {
        int dp[]=new int[nums.length+1];
        dp[0]=0;
        int count=0;
        for(int i=1;i<=nums.length;i++)dp[i]=dp[i-1]+nums[i-1];
        for(int i=1;i<=nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(dp[i]-dp[j]==k)count++;
            }
        }
        return count;
   }
}