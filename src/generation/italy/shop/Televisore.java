package generation.italy.shop;

public class Televisore extends Prodotto {
	
	private int displayInches;
	private boolean smartTvOptional;
	
	public Televisore(String name, String brand, int price, double tax, int displayInches, boolean smartTvOptional) {
		super(name, brand, price, tax);
		setDisplayInches(displayInches);
		setSmartTvOptional(smartTvOptional);
	}
	
//	Getters and setters
	
	public int getDisplayInches() {
		return this.displayInches;
	}
	
	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}
	
	public boolean getSmartTvOptional() {
		return this.smartTvOptional;
	}
	
	public void setSmartTvOptional(boolean smartTvOptional) {
		this.smartTvOptional = smartTvOptional;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nInches: " + getDisplayInches() + "\"\n" + (getSmartTvOptional() ? "Smart TV" : "Regular TV");
	}

}
