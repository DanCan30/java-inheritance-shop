package generation.italy.shop;


public class Smartphone extends Prodotto {
	
	private String imeiCode = "";
	private int memory;
	
	public Smartphone(String name, String brand, int price, double tax, int memory) {
		super(name, brand, price, tax);
		for(int i = 0; i < 15; i++) {
			this.imeiCode +=rand.nextInt(1, 11);			
		}
		setMemory(memory);
	}
	
//	Getters and setters
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public int getMemory() {
		return this.memory;
	}
	
	public String getImeiCode() {
		return this.imeiCode;
	}
	
//	-----------------------------------------
	@Override
	public String toString() {
		return super.toString() + "\nIMEI: " + getImeiCode() + "\nmemory: " + getMemory() + "GB";
	}
}
