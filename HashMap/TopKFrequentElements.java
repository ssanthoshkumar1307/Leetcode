class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num :  nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int arr[]=new int[k];
        int val=0;
        int m=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
                max=0;
                val=0;
            for(int num : map.keySet())
            {
                if(map.get(num)>max)
                {
                    max=map.get(num);
                    val=num;
                }
            }
            arr[m]=val;
            m++;
            map.remove(val);
      }
        return arr;
    }
}