public class ArrayBuyAndSell {
    public int maxProfit(int[] prices) {
        // Edge case: If the prices array is empty, return 0
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Start with the largest possible value
        int maxProfit = 0; // Initialize max profit as 0

        // Iterate through the array
        for (int price : prices) {
            // Update minPrice if the current price is lower than the previous minPrice
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate potential profit for the current price
            int potentialProfit = price - minPrice;
            
            // Update maxProfit if the potential profit is higher than the current maxProfit
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
        }
        return maxProfit; // Return the maximum profit found
    }

    public static void main(String[] args) {
        ArrayBuyAndSell solution = new ArrayBuyAndSell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit: " + solution.maxProfit(prices)); // Output: 5
    }
}
