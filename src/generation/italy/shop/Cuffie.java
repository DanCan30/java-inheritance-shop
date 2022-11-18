package generation.italy.shop;

public class Cuffie extends Prodotto {

	private String color;
	private boolean wireless;
	
	public Cuffie(String name, String brand, int price, double tax, String color, boolean wireless) {
		super(name, brand, price,tax);
		setColor(color);
		setWireless(wireless);
	}
	
//	Getters and setters
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean getWireless() {
		return this.wireless;
	}
	
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
//	-----------------------------------------
	
	@Override
	public String toString() {
		return super.toString() + "\nColor: " + getColor() + "\n" + (getWireless() ? "Wireless headphones" : "Cabled headphones");

	}
}
