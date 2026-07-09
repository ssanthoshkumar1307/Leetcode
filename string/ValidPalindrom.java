class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        String pali="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9'))
            {
                str+=ch;
            }
        }
        for(int i=str.length()-1;i>=0;i--)
        {
           pali+=str.charAt(i);   
        }

        if(str.equals(pali))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}