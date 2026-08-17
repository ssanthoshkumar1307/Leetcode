class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer>set=new TreeSet<>();
        for(int num: nums)set.add(num);
        int arr[]=new int[set.size()];
        int k=0;
        for(int x : set)
        {
            arr[k]=x;
            k++;
        }
        if(arr.length>=3)return arr[arr.length-3];
        else
        {
            int max=0;
            for(int x : set)
            {
                if(x>max)max=x;
            }
            return max;
        }
    }
}