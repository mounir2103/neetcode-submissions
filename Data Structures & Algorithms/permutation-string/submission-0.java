class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();
        StringBuilder window = new StringBuilder();
        boolean result = true;

        // 1. Build the first window
        for(int i = 0; i < k; i++){
            window.append(s2.charAt(i));
        }

        for(int i=0; i<k; i++){
            if(s1.indexOf(window.charAt(i)) != -1){
                result = false;
                return result;
            }else{
                continue;
            }
        }

        // 2. Slide the window
        for(int right = k; right < s2.length(); right++){

            // Remove the element leaving the window
            window.delete(right - k, right-k+1);
            // window -= s2.charAt(right - k);

            // Add the new element entering the window
            window.append(right);
            // window += s2.charAt(right);

            // Update the result
            // result = Math.max(result, window);
        }

        return result;
        
    }
}
