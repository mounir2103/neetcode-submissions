class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        //int p = 1;
        // for(int i=0 ; i<nums.length; i++){
        //     for(int j=0; j<nums.length; j++){
        //         if(i != j){
        //             p = p * nums[j];
        //         }
        //     }

        //     result[i] = p;
        //     p = 1;
        // }

        int left = 1;

    for (int i = 0; i < nums.length; i++) {
        result[i] = left;
        left *= nums[i];
    }

    int right = 1;

    for (int i = nums.length - 1; i >= 0; i--) {
        result[i] *= right;
        right *= nums[i];
    }

        return result;
    }
}  
