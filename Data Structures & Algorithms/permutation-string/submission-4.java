class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;

        int[] count = new int[26];
        int[] windowCount = new int[26];

        boolean result = false;

        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
        }

        for (int right = 0; right < s2.length(); right++) {

            windowCount[s2.charAt(right) - 'a']++;

            if (right - left + 1 > s1.length()) {
                windowCount[s2.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 == s1.length()) {
                if (Arrays.equals(count, windowCount)) {
                    return true;
                }
            }
        }

        return result;
    }
}