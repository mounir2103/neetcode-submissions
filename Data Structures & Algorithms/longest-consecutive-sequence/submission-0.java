class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        int size = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int n : set){
            if(!set.contains(n-1)){
                List<Integer> result = new ArrayList<>();
                result.add(n);
                while(set.contains(n+1)){
                    n++;
                    result.add(n);
                }
                size = result.size();
                count = Math.max(size, count);

                
            }
        }


        return count;

        
        
    }
}
