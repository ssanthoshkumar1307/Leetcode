class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int m=1;
        while(n>0)
        {
            if(n>=m)
            {
                n=n-m;
                count++;
                m++;
            }
            else break;

        }
        return count;
    }
}