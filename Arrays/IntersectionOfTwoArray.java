class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int x : nums1)list1.add(x);
        for(int y: nums2)
        {
            if(list1.contains(y))
            {
                list2.add(y);
                list1.remove(Integer.valueOf(y));
            }
        }
        int arr[]=new int[list2.size()];
        for(int i=0;i<list2.size();i++)arr[i]=list2.get(i);
        return arr;
    }
}