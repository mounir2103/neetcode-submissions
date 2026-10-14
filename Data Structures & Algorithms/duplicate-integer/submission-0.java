class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean result = false;

        for(int i : nums){
            if(map.getOrDefault(i, 0) == 0){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i)+1);
                result = true;
            }    
        }
        return result;
    }
}