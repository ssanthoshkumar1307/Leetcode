class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(int i=0;i<operations.length;i++)
        {
            String str=operations[i];
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)=='-')
                {
                    count-=1;
                    break;
                }
                if(str.charAt(j)=='+')
                {
                    count+=1;
                    break;
                }
            }
        }
        return count;
        
    }
}