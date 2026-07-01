class Solution {
    public boolean isPerfectSquare(int num) {
        boolean found=false;
        int mid=num/2;
        if(num<=9)mid=num;
        for(int i=1;i<=mid;i++)
        {
            if(i*i==num)
            {
                found=true;
                break;
            }
        }
        return found;
        
    }
}