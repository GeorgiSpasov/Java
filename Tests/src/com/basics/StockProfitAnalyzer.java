package com.basics;

public class StockProfitAnalyzer {

    public static void main(String[] args) {
        int[] prices = {10, 4, 5, 20, 15, 12, 25, 2, 13, 1, 6};

        int buyPrice = 0;
        int buyDay = 0;
        int sellPrice = 0;
        int sellDay = 0;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if (maxProfit < (prices[j] - prices[i])) {
                    maxProfit = (prices[j] - prices[i]);
                    buyDay = i;
                    buyPrice = prices[i];
                    sellDay = j;
                    sellPrice = prices[j];
                }
            }
        }
        System.out.printf("Day to buy: %d for $ %d.\nDay to sell: %d for $ %d.\nMaximum profit: $ %d\n", buyDay, buyPrice, sellDay, sellPrice, (sellPrice - buyPrice));
    }
}
