package bai01;

public class StockObserverPatternDemo {
	public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.0);
        
        Investor investor1 = new Investor("John");
        Investor investor2 = new Investor("Alice");
        
        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);
        
        // Change price, which triggers notifications
        appleStock.setPrice(155.0);
        appleStock.setPrice(160.5);
    }
}
