class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        int arr[]=new int[nums.length];
        int k=0;
        int m=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                arr[k]=pos.get(m);
                k++;
                m++;
            }
            else
            {
                arr[k]=neg.get(j);
                k++;
                j++;
            }
        }

        return arr;
    }
}