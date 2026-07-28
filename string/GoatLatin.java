class Solution {
    public String toGoatLatin(String sentence) {
        String[]parts=sentence.split(" ");
        String rev="";
        int count=1;
        for(int i=0;i<parts.length;i++)
        {
            String str=parts[i];
            char ch=str.charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                rev+=str;
            }
            else 
            {
                char ch1=str.charAt(0);
                rev+=str.substring(1)+ch1;
            }
            rev+="ma";
            for(int j=0;j<=i;j++)rev+="a";
            if(i!=parts.length-1)rev+=" ";

        }
        return rev;
    }
}