package com.pizzastationproject;

import java.util.Scanner;
class selectionException extends Exception{
	public String toString() {
		return("Invalid Choice Entered");
	}
}

public class PizzaStationDemo {

	public static void main(String[] args) {
		boolean pizzaStation = true;

		while(pizzaStation) {
			System.out.println("\nEnter a pizza tyepe Veg or NonVeg:");
			Scanner sc = new Scanner(System.in);
			String type = sc.nextLine();
			if (type.equalsIgnoreCase("Veg")) {
				Pizza pizza1 = new VegPizaa();
				pizza1.make();


			}
			else if(type.equalsIgnoreCase("NonVeg")) {
				Pizza pizza2 = new NonVegPizza();
				pizza2.make();

			}
			else {
				System.out.println("Invalid input");
			}
			System.out.println("\n\nContinue ordering: Yes or No");
			String cont = sc.nextLine();
			if (cont.equalsIgnoreCase("no")){
				System.out.println("---Thanks! & Come again---");
				pizzaStation = false;

			}
			else if (cont.equalsIgnoreCase("yes")) {
				pizzaStation = true;

			}
			else {sc.close();
			try {
				throw new selectionException();
			}catch(selectionException e) {
				e.printStackTrace();

			}
			}

		}		

	}
}


