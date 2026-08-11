class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        int left=0;
        for(int right=0;right<fruits.length;right++)
        {
            int val=fruits[right];
            map.put(val,map.getOrDefault(val,0)+1);
            while(map.size()>2)
            {
                int re=fruits[left];
                map.put(re,map.get(re)-1);
                if(map.get(re)==0)map.remove(re);
                left++;
            }
        max=Math.max(max,right-left+1);
        }
        return max;
    }
}