class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int e: nums){
            numSet.add(e);
        }

        int max = 0;

        for(int c : numSet){
            if(!numSet.contains(c - 1)){
                int current = c ;
                int length = 1;
            

                while(numSet.contains(current + 1)){
                    current++;
                    length++;
                }
                max = Math.max(max, length);
            }
            
        }

        return max;
    }
}
