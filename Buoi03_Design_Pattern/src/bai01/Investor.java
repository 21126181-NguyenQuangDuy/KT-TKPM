package bai01;

public class Investor implements Observer{
	private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Investor " + name + " notified. " +
                "Stock " + stockName + " is now " + price);
    }
}
