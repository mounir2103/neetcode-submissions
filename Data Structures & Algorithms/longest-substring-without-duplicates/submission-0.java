class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();

        for(int right = 0; right < s.length(); right++){

            // 1. Expand the window
            // Include nums[right]
            

            while(set.contains(s.charAt(right))){

                // 2. Shrink the window
                // Remove nums[left]
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            result = Math.max(result, set.size());

            // 3. Update the result
        }

        return result;
        
    }
}
