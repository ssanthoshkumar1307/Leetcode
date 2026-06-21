class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
           String val=words[i];
           String rev="";
           for(int j=val.length()-1;j>=0;j--)
           {
              rev+=val.charAt(j);
           }
           if(rev.equals(val))
           {
            return val;
           }
        }
        return "";
    }
}