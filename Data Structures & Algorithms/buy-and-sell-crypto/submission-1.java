class Solution {
    public int maxProfit(int[] prices) {
        // int left = 0;
        // int right = left+1;
        // int maxProfit = 0;

        // while(left < right){
        //     for(right=left+1; right<prices.length; right++){
        //         maxProfit = Math.max(maxProfit, prices[right]-prices[left]);
        //     }
        //     left++;
        // }
        // return maxProfit;   


        int maxProfit = 0;
        int minPrice = prices[0];

        for(int i=1; i<prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
