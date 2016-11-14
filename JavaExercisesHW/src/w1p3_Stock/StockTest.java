/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1p3_Stock;

import javax.swing.JOptionPane; 
/**
 *
 * @author Georgi Spasov
 */
public class StockTest {

    public static void main(String[] args) {

        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;
        
        symbol = JOptionPane.showInputDialog("Enter stock symbol");
        name = JOptionPane.showInputDialog("Enter stock name");
        previousClosingPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter closing price"));
        currentPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter current price"));
        
        Stock stockTest = new Stock(symbol, name);
        stockTest.setPreviousClosingPrice(previousClosingPrice);
        stockTest.setCurrentPrice(currentPrice);
        System.out.printf("%s %s change percentage: %.2f%%", symbol, name, stockTest.changePercent() * 100);

    }
}
