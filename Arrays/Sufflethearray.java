class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m=nums.length;
        int mid=m/2;
        int arr1[]=new int[mid];
        int arr2[]=new int[mid];
        int arr3[]=new int[m];
        int k=0;
        int l=0;
        for(int i=0;i<mid;i++)
        {
            arr1[i]=nums[i];
        }
        for(int j=mid;j<m;j++)
        {
            arr2[l]=nums[j];
            l++;
        }
        for(int i=0;i<mid;i++)
        {
            arr3[k]=arr1[i];
            k++;
            arr3[k]=arr2[i];
            k++;
        }

        return arr3;
    }
}