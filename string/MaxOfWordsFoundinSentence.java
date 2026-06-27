class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int arr[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            String []parts=sentences[i].split(" ");
            count=parts.length;
            arr[k]=count;
            k++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}