class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)return 0;
        String str=String.valueOf(n);
        String val="";
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)!='0')val+=str.charAt(i);
        }
        long num=Long.parseLong(val);
        long x=num;
        int sum=0;
        while(num>0)
        {
            int digit=(int)num%10;
            sum+=digit;
            num=num/10;
        }
        return (long)x*sum;
    }
}