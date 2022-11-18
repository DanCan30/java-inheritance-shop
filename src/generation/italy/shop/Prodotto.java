package generation.italy.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

	private int productCode;
	private String name;
	private String brand;
	private int price;
	private double tax;
	
	public Random rand = new Random();
	DecimalFormat format2decimals = new DecimalFormat("0.00");
	
	public Prodotto(String name, String brand, int price, double tax) {
		
		this.productCode = rand.nextInt(1000, 10000);
		setName(name);
		setBrand(brand);
		setPrice(price);
		setTax(tax);
	}

	//Getters and setters
	
	public int getProductCode() {
		return this.productCode;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {

		String formattedBrand = brand.substring(0, 1).toUpperCase() + brand.substring(1);
		this.brand = formattedBrand;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getTax() {
		
		return tax / 100d;
		
	}
	
	public void setTax(double tax) {
		this.tax = tax;

	}

// -------------------------------
	
	public double getFullPrice() {
		return getPrice() + (getPrice() * getTax());
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product: " + getName()
		+ "\nRaw price: " + format2decimals.format(getPrice())
		+ "€\nTax: " + tax
		+ "%\nTotal price: " + format2decimals.format(getFullPrice()) + "€";
	}
}
