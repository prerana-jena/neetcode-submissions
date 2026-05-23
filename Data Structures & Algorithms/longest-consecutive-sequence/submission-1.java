class Solution {
    public int longestConsecutive(int[] nums) {
        int c=1;
        int l=1;
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                continue;
            }
            if(nums[i]==nums[i+1]-1)
            {
                c++;
            }
            else
            {
                l=Math.max(l,c);
                c=1;
            }
        }
        return Math.max(l,c);
    }
}
