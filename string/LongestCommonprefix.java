class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        String str = strs[0];
        
        for(int i = 0; i < str.length(); i++)
        {
            for(int j = 1; j < strs.length; j++)
            {
                if(i >= strs[j].length() || str.charAt(i) != strs[j].charAt(i))
                {
                    return res;
                }
            }
            res = res + str.charAt(i);
        }
        
        return res;
    }
}