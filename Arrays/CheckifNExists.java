class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean find=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==2*arr[j]&&i!=j)
                {
                    find=true;
                    break;
                }
            }
        }
        return find;
        
    }
}