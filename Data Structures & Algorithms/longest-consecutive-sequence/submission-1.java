class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        int size = 1;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int n : set){
            if(!set.contains(n-1)){
                while(set.contains(n+1)){
                    n++;
                    size++;
                }
                count = Math.max(size, count);

                
            }
        }


        return count;

        
        
    }
}
