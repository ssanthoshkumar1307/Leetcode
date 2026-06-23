class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                arr[k]=nums[i];
                k++;
            }
        }
        int zero=n-arr.length;
        for(int i=0;i<zero;i++)
        {
            arr[k]=0;
            k++;
        }
        for(int i=0;i<n;i++)nums[i]=arr[i];
    }
}