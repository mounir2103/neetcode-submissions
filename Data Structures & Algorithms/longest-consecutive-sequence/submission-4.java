class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int size = 0;
        int count = 0;

        for(int n : set){
            if(!set.contains(n-1)){
                size = 1;
                while(set.contains(n+1)){
                    n++;
                    size++;
                }
            }
            count = Math.max(count, size);

        }

        return count;
        
    }
}
