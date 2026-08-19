class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        int ind=-1;
        int ind2=-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                String fir=String.valueOf(i);
                String las=String.valueOf(j);
                if(!fir.contains("0")&&!las.contains("0"))
                {
                    if(i+j==n)
                    {
                        ind=i;
                        ind2=j;
                        break;
                    }
                 }
            }
            if(ind!=-1&&ind2!=-1)break;
        }
        arr[0]=ind;
        arr[1]=ind2;
        return arr;
    }
}