class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        int min=-1;
        for(int i=0;i<k;i++)
        {
            char ch=blocks.charAt(i);
            if(ch=='W')count++;
        }
        min=count;
        for(int i=k;i<blocks.length();i++)
        {
            char out=blocks.charAt(i-k);
            if(out=='W')count--;
            char in=blocks.charAt(i);
            if(in=='W')count++;
            min=Math.min(count,min);
        }
        return min;
    }
}