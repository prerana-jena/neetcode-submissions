class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxcap=0;
        while(left<right)
        {
            int width=right-left;
            int height=Math.min(heights[left],heights[right]);
            int area=width*height;
            maxcap=Math.max(area,maxcap);
            if(heights[left]<heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxcap;
        
    }
}
