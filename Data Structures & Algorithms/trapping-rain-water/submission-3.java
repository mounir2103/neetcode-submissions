class Solution {
    public int trap(int[] height) {
        // int size = height.length;
        // int[] result = new int[size];
        // int r = 0;

        // for(int i=1; i<size-1; i++){
        //     int left = i-1;
        //     int right = i+1;
        //     int leftMax = 0;
        //     int rightMax = 0;
        //     while(left>=0 && right<size){
        //         leftMax = Math.max(leftMax, height[left]);
        //         left--;
        //         rightMax = Math.max(rightMax, height[right]);
        //         right++;
        //     }

        //     result[i] = Math.max(0, (Math.min(leftMax, rightMax) - height[i]));

        // }
        // for(int j : result){
        //     r += j;
        // }
        // return r;


        int size = height.length-1;
        int result = 0;

        int[] leftMax = new int[size];
        leftMax[0] = height[0];
        for(int i=1; i<size; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        int[] rightMax = new int[size];
        rightMax[size-1] = height[size-1];
        for(int i=size-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        for(int i=1; i<size-1; i++){
            result += Math.max(0, (Math.min(leftMax[i], rightMax[i]) - height[i]));

        }
        return result;
        
    }
}
