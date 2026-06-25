class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int []arr=new int[n+1];
        arr[0]=0;
        int sum=0;
        int k=1;
        for(int i=0;i<n;i++)
        {
            sum=sum+gain[i];
            arr[k]=sum;
            k++;
        }
        int max=0;
        for(int i=0;i<k;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}