class Solution {
    public int[] twoSum(int[] nums, int target) {
        int searched = 0;
        int[] result = new int[2];
        for(int i=0 ; i<nums.length; i++){
            // if(nums[i] > target){
            //     continue;
            // }else{
                searched = target - nums[i];
                for(int j=0 ; j<nums.length; j++){
                    if(i != j){
                        if(nums[j] == searched){
                            if(i<j){
                                result[0] = i;
                                result[1] = j;
                            }else{
                                result[0] = j;
                                result[1] = i;
                            }
                        }
                    }
                }
        }
        return result;
        
    }
}
