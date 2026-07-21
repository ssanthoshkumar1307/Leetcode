class Solution {
    public int addDigits(int num) {
      int val=num;
      int sum=0;
      if(num<=9)return num;
      while(val>=10)
      {
          sum=0;
          int x=val;
          while(x>0)
          {
            int digit=x%10;
            sum+=digit;
            x/=10;
          }
          val=sum;
      }
      return sum;
    }
}