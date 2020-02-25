package WeekFour;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	private double changePercent;

	Stock(String nameAssignment, String symbolAssignment) {
		this.name = nameAssignment;
		this.symbol = symbolAssignment;
	}
	
	public void assignPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public void assignCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public void getChangePercent() {
		this.changePercent = (this.previousClosingPrice - this.currentPrice) / this.previousClosingPrice;
	}
	
	public void printObjectStats() {
		System.out.println("You created an object.");
		System.out.println("Name: " + this.name);
		System.out.println("Symbol: " + this.symbol);
		System.out.println("Previous Price: " + this.previousClosingPrice);
		System.out.println("New Price: " + this.currentPrice);
	}
	
	public void printChangePercent() {
		if(this.previousClosingPrice > this.currentPrice) {
			System.out.println("This stock object has a " + this.changePercent + "% decrease in price.");
		} else {
			System.out.println("This stock object has a " + this.changePercent + "% increase in price.");
		}
	}
}
