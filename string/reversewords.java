class Solution {
    public String reverseWords(String s) {
       String rev="";
       String []parts=s.trim().split("\\s+");
       for(int i=parts.length-1;i>=0;i--)
       {
        rev+=parts[i];
        
        if(i!=0)rev+=" ";
       }   
       return rev;
    }
}