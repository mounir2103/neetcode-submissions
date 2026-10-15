class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;
        int[] result = new int[2];
        // Arrays.sort(nums);

        while(left < right){
            sum = nums[left] + nums[right];
            if( sum < target){
                left++;
            }else if(sum > target){
                right--;
            }else{
                result[0] = left;
                result[1] = right;
                break;
            }

        }
        return result;

    }
}
