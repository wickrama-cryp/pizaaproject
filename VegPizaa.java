package com.pizzastationproject;

import java.util.Scanner;

public class VegPizaa extends Pizza {
	private int id;

	public VegPizaa() {
		super();
		// TODO Auto-generated constructor stub
	}
    static int counter =100;
	public VegPizaa(int id, String name, String size, String topping, double price,int pieces) {
		super(name, size, topping, price,pieces);
		this.id = counter++;
	}
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void make() {
		System.out.println("Type a Maintopping \n 1.Spinach \n 2.Cheese \n 3.Dulux");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		
		System.out.println("Select a size \n M \n L\n XL");
	    String sizeChoice = sc.nextLine();
	
	    System.out.println("Would you like some: \n Extra Cheese \n Extra Onion \n None");
	  	String toppingChoice = sc.nextLine();
	  	System.out.println("How many pieces would you like: ");
	  	int pieces = sc.nextInt();
	    if (choice.equalsIgnoreCase("Spinach") || choice.equalsIgnoreCase("Cheese")) {
			     double price = 23.99;
			     VegPizaa pizza1 = new VegPizaa(1,choice,sizeChoice,toppingChoice,price,pieces);
			     System.out.println("Your order id:"+pizza1.getId());
			     pizza1.printDetails();
			     //pizzaStation = true;
	     }
	    else if (choice.equalsIgnoreCase("Dulux")){
			    double price = 25.99;
			     VegPizaa pizza2 = new VegPizaa(1,choice,sizeChoice,toppingChoice,price,pieces);
			     System.out.println("Your order id:"+pizza2.getId());
			     pizza2.printDetails();
			    // pizzaStation = true;
	    }
	
}

	public double calPrice(double piecePrice, int pieces) {
    	double price = piecePrice*pieces;
    	return (price);
    	
    	
    }
	
	

	
}
