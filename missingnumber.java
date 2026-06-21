class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int max=nums[n-1];
        for(int i=0;i<=max;i++)
        {
            if(i!=nums[i])return i;
        }
        return n;
    }
}