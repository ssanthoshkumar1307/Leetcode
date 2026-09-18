import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    ArrayList<List<Integer>>list=new ArrayList<>();
    ArrayList<Integer>slist=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n=candidates.length;
        Arrays.sort(candidates);
        combination(0,candidates,target,n,0);
        return list;
    }
    void combination(int start,int []arr,int target,int n,int sum)
    {
        if(sum>target)return;
        if(sum==target)
        {
            list.add(new ArrayList<>(slist));
            return;
        }
        for(int i=start;i<n;i++)
        {
            if(i>start&&arr[i]==arr[i-1])continue;
            slist.add(arr[i]);
            sum+=arr[i];
            combination(i+1,arr,target,n,sum);
            slist.remove(slist.size()-1);
            sum-=arr[i];
        }
    }
} {
    
}
