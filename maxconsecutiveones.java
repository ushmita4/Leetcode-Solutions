class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int i,f=0,max=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                f++;
                max=Math.max(max,f);
            }
            else
                f=0;
        }
        return max;
    }
}
