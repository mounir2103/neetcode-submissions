class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int right = 0;

        int result = 0;
        int[] count = new int[26];
        

        int windowLength = 0;
        int maxFreq = 0;
        int replacementsNeeded =0;

        while(right < s.length()){

            count[s.charAt(right) - 'A']++;
            for(int c : count){
                maxFreq = Math.max(maxFreq, c);
            }
            windowLength = right - left + 1;
            replacementsNeeded = windowLength - maxFreq;

            if(replacementsNeeded > k){
                count[s.charAt(left) - 'A']--;
                left++;
                
            }else{
                result = Math.max(result, windowLength);
            }

            right++;
            
        }
        return result;
    }
}
