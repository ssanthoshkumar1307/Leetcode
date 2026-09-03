import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String str = "";
        for(int i = 0; i < num.length; i++) str += num[i];
        BigInteger val = new BigInteger(str);
        BigInteger res = val.add(BigInteger.valueOf(k));
        String ans = res.toString();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < ans.length(); i++)
        {
            int v = ans.charAt(i) - '0';
            list.add(v);
        }
        return list;
    }
}