class Solution {
    public String reversePrefix(String str, char ch) {
        String first="";
        String last="";
        int ind=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                ind=i;
                break;
            }
            else first+=str.charAt(i);
        }
        if(first.equals(str))return str;
        last+=ch;
        for(int i=first.length()-1;i>=0;i--)
        {
            last+=first.charAt(i);
        }
        for(int i=ind+1;i<str.length();i++)last+=str.charAt(i);
        return last;
    }
}