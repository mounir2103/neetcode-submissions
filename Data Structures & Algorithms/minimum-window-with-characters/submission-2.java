class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int required = need.size(); 
        Map<Character, Integer> windowCounts = new HashMap<>();
        int formed = 0; 

        int left = 0;
        int bestLen = -1, bestLeft = 0, bestRight = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && windowCounts.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {
                char leftChar = s.charAt(left);

                if (bestLen == -1 || right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestLeft = left;
                    bestRight = right;
                }

                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);
                if (need.containsKey(leftChar) && windowCounts.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                left++;
            }
        }

        return bestLen == -1 ? "" : s.substring(bestLeft, bestRight + 1);
    }
}
