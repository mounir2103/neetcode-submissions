class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int size = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        

        Arrays.sort(nums);
        for(int i=0; i<size; i++){
            int left = i+1;
            int right = size - 1;

            while(left < right){
                int sum = nums[left] + nums[right] + nums[i];
                if(sum > 0){
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    triplet.add(nums[i]);
                    result.add(triplet);
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }

                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }

            }
        }
       

        return result;
        
    }
}
