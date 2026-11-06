class Solution {
    public int maxArea(int[] heights) {
        // int result = 0;
        
        // int size = heights.length;

        // for(int i=0; i<size; i++){
        //     int k = i+1;
        //     while(k < size){
        //     int area = Math.min(heights[i], heights[k]) * (k-i);
        //         result = Math.max(result, area);
        //         k++;
        //     }
            
        // }

        // return result;




        int size = heights.length;
        int left = 0;
        int right = size -1;
        int result = 0;

        while(left < right){
            int area = Math.min(heights[left], heights[right]) * (right - left);
            result = Math.max(result, area);
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }

        }

        return result;
        
    }
}
