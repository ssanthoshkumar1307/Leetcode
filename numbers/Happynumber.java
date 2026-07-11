class Solution {
    public boolean isHappy(int n) {
        int fin=-1;
        int count=0;
        while(fin!=1)
        {
            int sum=0;
            while(n>0)
            {
                int digit=n%10;
                int squ=digit*digit;
                sum+=squ;
                n=n/10;
            }
            n=sum;
            fin=sum;
            count++;
            if(count>10)return false;
        }
        if(fin==1)return true;
        else return false;
        
    }
}