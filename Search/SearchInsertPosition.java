class Solution {
    public int searchInsert(int[] nums, int target) {
        int ind=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)ind=i;
        }
        if(ind==-1)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>target){
                    ind=i;
                    break;
                }
            }
        }
        if(ind==-1)ind=nums.length;
        return ind;
    }
}