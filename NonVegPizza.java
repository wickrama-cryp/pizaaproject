package com.pizzastationproject;

import java.util.Scanner;

public class NonVegPizza extends Pizza {
	private int id;
	static int counter = 200;
	public NonVegPizza(int id,String name, String size, String topping, double price, int pieces) {
		super(name, size, topping, price, pieces);
		this.id = counter++;
	}
	public NonVegPizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public double calPrice(double piecePrice, int pieces) {
		double total = (piecePrice * pieces) +0.50;
		return total;
	}
	@Override
	protected void make() {
		System.out.println("Type a Maintopping \n 1.3Meat \n 2.Steak \n 3.Anchovy");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		
		System.out.println("Select a size \n M \n L\n XL");
	    String sizeChoice = sc.nextLine();
	
	    System.out.println("Would you like some: \n Extra Cheese \n Extra Onion \n None");
	  	String toppingChoice = sc.nextLine();
	  	System.out.println("How many pieces would you like: ");
	  	int pieces = sc.nextInt();
	    if (choice.equalsIgnoreCase("Anchovy") || choice.equalsIgnoreCase("3Meat")) {
			     double price = 28.99;
			     NonVegPizza pizza1 = new NonVegPizza(1,choice,sizeChoice,toppingChoice,price,pieces);
			     System.out.println("Your order id:"+pizza1.getId());
			     pizza1.printDetails();
			     
	     }
	    else if (choice.equalsIgnoreCase("Steak")){
			    double price = 29.99;
			    NonVegPizza pizza2 = new NonVegPizza(1,choice,sizeChoice,toppingChoice,price,pieces);
			    System.out.println("Your order id:"+pizza2.getId());
			    pizza2.printDetails();
			  
	    }
		
	}

	
	
	
	
	

}
