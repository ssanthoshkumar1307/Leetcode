class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int k=1;
        int arr[]=new int[n];
        arr[0]=nums[0];
        int m=1;
        for(int j=0;j<n-1;j++)
        {
            int sum=0;
            for(int i=1;i<=m;i++)
            {
                if(i==1)sum+=nums[0]+nums[i];
                else sum+=nums[i];

            }
            arr[k]=sum;
            k++;
            if(m<n)m++;

        }
        return arr;
    }
}