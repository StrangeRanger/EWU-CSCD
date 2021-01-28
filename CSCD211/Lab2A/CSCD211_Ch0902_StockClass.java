// *****************************************************************************
//
// Name:        Hunter T.
// Date:        January 22, 2021
// Class:       CSCD 211
// Description: Prints out the previous stock price, the current stock price,
//              and the price change in percentage.
//
// *****************************************************************************

public class CSCD211_Ch0902_StockClass {
    /** Main method */
    public static void main(String[] args) {
        Stock stocks = new Stock("ORCL", "Oracle Corporation");

        System.out.println("Previous Closing Price: " + stocks.previousClosingPrice);
        System.out.println("Current Price: " + stocks.currentPrice);
        System.out.println("Price Change: " + stocks.getChangePercent() + "%");
    }
}


class Stock {
    String symbol, name;
    double previousClosingPrice = 34.5, currentPrice = 34.35 ;

    /**
     * Construct a stock with a symbol and name
     */
    Stock(String specifiedSymbol, String specifiedName) {
        symbol = specifiedSymbol;
        name = specifiedName;
    }

    /**
     * Return the the percentage difference of the current and previous stock
     * price
     */
    double getChangePercent() {
        double percent = ((1 - (currentPrice / previousClosingPrice)) * 100);

        // Determines whether to return a negative or positive percentage
        if (currentPrice < previousClosingPrice) {
            return (percent - (percent * 2));
        } else {
            return percent;
        }

    }
}