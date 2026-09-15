class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int area = 0;
        while(l<r){
            int areacal = (r-l) * Math.min(heights[l],heights[r]);
            area = Math.max(area,areacal);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }

        return area;
    }
}
