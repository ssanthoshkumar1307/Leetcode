class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String rev="";
        while(i<word1.length()&&j<word2.length())
        {
            rev+=word1.charAt(i);
            rev+=word2.charAt(j);
            i++;
            j++;
        }
        while (i < word1.length()) {
            rev += word1.charAt(i);
            i++;
        }

        while (j < word2.length()) {
            rev += word2.charAt(j);
            j++;
        }
        return rev;
    }
}