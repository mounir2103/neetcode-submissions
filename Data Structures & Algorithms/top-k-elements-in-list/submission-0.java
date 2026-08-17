class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for(int i=0; i<nums.length; i++){
            map.merge(nums[i], 1, Integer :: sum);
        }

        List<Map.Entry<Integer, Integer>> sortedValues = new ArrayList<>(map.entrySet());
        sortedValues.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        for(int j=0; j<k; j++){
            result[j] = sortedValues.get(j).getKey();
        }
        return result;
    }
}
