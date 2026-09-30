class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
        int num=1,num2=2;
        for(int i=0;i<n;i++)
        {
            odd+=num;
            num+=2;
            even+=num2;
            num2+=2;
        }
        int res=gcd(odd,even);
        return res;
    }
    static int gcd(int a,int b)
    {
        if(b==0)return a;
        return gcd(b,a%b);
    }
}