class Solution {
    public int[] twoSum(int[] arr, int tar) {
        int n = arr.length;
        int ind1=0;
        int ind2=0;
        int array[]=new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == tar) {
                    ind1=i;
                    ind2=j;
                }
            }
        }
        array[0]=ind1;
        array[1]=ind2;
        return array;
    }
}
