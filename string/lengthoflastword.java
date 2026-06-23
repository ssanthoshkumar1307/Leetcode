class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String[] parts=s.split(" ");
        int n=parts.length;
        String last=parts[n-1];
        for(int i=0;i<last.length();i++)
        {
            count++;
        }
        return count;
    }
}