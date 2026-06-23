class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int ind1=0;
        int ind2=0;
        int j=numbers.length-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
            {
                ind1=i;
                ind2=j;
                break;
            }
            else if(numbers[i]+numbers[j]>target)j--;
            else i++;
        }
        int arr[]=new int[2];
        arr[0]=ind1+1;
        arr[1]=ind2+1;
        return arr;
        
    }
}