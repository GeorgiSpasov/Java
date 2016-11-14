/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1p3_Stock;

/**
 *
 * @author Gergi Spasov
 */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    public Stock (String symbolS, String nameS){
        symbol = symbolS;
        name = nameS;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
    public double changePercent(){
        return 1 + getCurrentPrice() / getPreviousClosingPrice();
    }
    
}
