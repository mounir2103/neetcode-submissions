class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int product = 1;
            int k = i+1;
            while(k < nums.length){
                product *= nums[k];
                k++;
            }
            result[i] = product;
            
        }

        for(int j=nums.length-1; j>=0; j--){
            int product = 1;
            int k = j-1;
            while(k >= 0 ){
                product *= nums[k];
                k--;
            }

            result[j] *= product;

        }
        return result;
    }
}  
