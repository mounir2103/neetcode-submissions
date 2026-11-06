class Solution {
    public int maxArea(int[] heights) {
        // int result = 0;
        int max = 0;
        
        int size = heights.length;

        for(int i=0; i<size; i++){
            int k = i+1;
            while(k < size){
            int area = Math.min(heights[i], heights[k]) * (k-i);
                max = Math.max(max, area);
                k++;
            }
            
        }

        return max;
        
    }
}
