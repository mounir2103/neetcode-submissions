class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        

        Set<Character> result = new HashSet<>();
        int maxLength = 0;
        

        while(right < s.length()){
            if(!result.add(s.charAt(right))){
                
                // left = right;
                // result = new HashSet<>();
                // result.add(s.charAt(left));

                result.remove(s.charAt(left));
                left++;
            }else{
                maxLength = Math.max(maxLength, result.size());
                right++;
            }
            
        }

        return maxLength;
        
    }
}
