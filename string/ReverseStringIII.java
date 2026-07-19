class Solution {
    public String reverseWords(String s) {
        String[] parts=s.split(" ");
        String str="";
        for(int i=0;i<parts.length;i++)
        {
            String val=parts[i];
            for(int j=val.length()-1;j>=0;j--)
            {
                str+=val.charAt(j);
            }
            if(i<parts.length-1) str+=" ";       
        }
        return str;
    }
}