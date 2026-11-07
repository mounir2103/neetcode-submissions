class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = left+1;
        int maxProfit = 0;

        while(left < right){
            for(right=left+1; right<prices.length; right++){
                maxProfit = Math.max(maxProfit, prices[right]-prices[left]);
            }
            left++;
        }
        return maxProfit;      
    }
}
