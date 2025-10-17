/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let minPrice = prices[0];
    let maxProfit = 0;

    for (let i = 1; i < prices.length; i++) {
        // Update minPrice if current is lower
        if (prices[i] < minPrice) {
            minPrice = prices[i];
        } else {
            // Calculate profit if sold today
            let profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
    }

    return maxProfit;
};
