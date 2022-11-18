package generation.italy.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean validChoice = false;
		int currentIndex = 0;
		
		Prodotto[] productList = new Prodotto[10];
		
		
		System.out.println("Add a new product or check the catalog: ");
		while(!validChoice) {

			System.out.println("0 - Catalog \n1 - Smartphone \n2 - Television \n3 - Headphones");
			byte userChoice = sc.nextByte();
			
			if(userChoice == 0) {
				
				System.out.println(Arrays.toString(productList));
				
			} else if (userChoice == 1 || userChoice == 2 || userChoice == 3) {

				validChoice = true;
				
				System.out.print("Insert the name: ");
							
				String name = sc.next();
				
				System.out.print("Insert the brand: ");
				String brand = sc.next();
				
				System.out.print("Insert the price: ");
				int price = sc.nextInt();
				System.out.print("Insert the tax amount: ");
				double tax = sc.nextInt();
				
				if(userChoice == 1) {
					
					System.out.print("Insert the memory of the device: ");
					int memory = sc.nextInt();
					
					Smartphone smartphone = new Smartphone(name, brand, price, tax, memory);
					
					System.out.println(smartphone);
					productList[currentIndex] = smartphone;
					currentIndex++;
					validChoice = false;
							
			} else if (userChoice == 2) {
				
				System.out.print("Insert the display inches: ");
				int displayInches = sc.nextInt();

				boolean isValid = false;
				
				boolean smartTvOptional = false;
				
				System.out.println("Smart TV(y/n): ");
				while(!isValid) {
					
					String smartTv = sc.next();
						
					if(smartTv.equals("y")) {
						smartTvOptional = true;
						isValid = true;
					} else if (smartTv.equals("n")) {
						smartTvOptional = false;
						isValid = true;
					} else {
						System.out.println("Value not valid. Try again (y/n)");
					}
				}
				
				if(isValid) {
					Televisore television = new Televisore(name, brand, price, tax, displayInches, smartTvOptional);					
					System.out.println(television);
					productList[currentIndex] = television;
					currentIndex++;
					validChoice = false;
				}

			} else if (userChoice == 3) {
				
				System.out.print("Insert the color: ");
				String color = sc.next();
				
				boolean isValid = false;
							
				boolean wireless = false;
				
				System.out.println("Wireless (y/n): ");
				while(!isValid) {
					
					String wirelessInput = sc.next();
						
					if(wirelessInput.equals("y")) {
						wireless = true;
						isValid = true;
					} else if (wirelessInput.equals("n")) {
						wireless = false;
						isValid = true;
					} else {
						System.out.println("Value not valid. Try again (y/n)");
					}
				}
				
				if(isValid) {
					Cuffie headphones = new Cuffie(name, brand, price, tax, color, wireless);					
					System.out.println(headphones);
					productList[currentIndex] = headphones;
					currentIndex++;
					validChoice = false;
				}
			}
		} else {
			System.out.println("Please insert a valid number.");
		}
		}
		
		sc.close();
	}
}
