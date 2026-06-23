class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if((ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')&&(ch[j]>='a'&&ch[j]<='z'||ch[j]>='A'&&ch[j]<='Z'))
            {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(!Character.isLetter(ch[i]))i++;
            else j--;
        }
        return new String(ch);
    }
}