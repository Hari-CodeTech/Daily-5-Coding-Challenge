package com.Methods;

public class Food {
	//double pbill=0.0;
	double bill;
	String item1; String item2;String item3;String item4;String item5;
	public void displayMenu() {
	
		System.out.println("========= MENU =========\r\n"
				+ "1. Pizza                ₹250\r\n"
				+ "2. Coke                 ₹50\r\n"
				+ "3. Chicken Dum Biryani  ₹300\r\n"
				+ "4. Fry Piece Special    ₹350\r\n"
				+ "5. Icecream Special     ₹100\r\n"
				+ "========================");
	}
	public void calculateBill(int quantity, double price) {
		bill=quantity*price;
		System.out.println("intial Bill Amount: "+bill);
	}
	public void calculateDiscount() {
		System.out.println("Bill Before Apply Discount: "+bill);
		
		if(bill>1000) {
			bill=bill*0.90;
			System.out.println("Bill After Apply Discount 10% : "+bill);
		}
		else {
			System.out.println(bill);
		}
	}
	public void printBill() {
		System.out.println("Final Bill:"+bill);
	}

	public static void main(String[] args) {
		Food f=new Food();
		f.displayMenu();
		f.calculateBill(5,250.0);
		f.calculateDiscount();
		f.printBill();

	}

}
