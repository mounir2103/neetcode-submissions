class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int size = clean.length();
        for(int i=0; i<size/2; i++){
            if(clean.charAt(i) != clean.charAt(size-i-1)){
                return false;
            }
        }

        return true;
        
    }
}
