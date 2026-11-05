class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            result[i] = prefix;
            prefix *= nums[i];
            
        }

        for(int j=nums.length-1; j>=0; j--){
            result[j] *= suffix;
            suffix *= nums[j];

        }
        return result;
    }
}  
