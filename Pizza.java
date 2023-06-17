package com.pizzastationproject;

public abstract class Pizza {
     private String name;
     private String size;
     private String topping;
     private double price;
     private int pieces;
     
     public Pizza() {  }

	public Pizza(String name, String size, String topping, double price,int pieces) {
		super();
		this.name = name;
		this.size = size;
		this.topping = topping;
		this.price = price;
		this.pieces =pieces;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", size=" + size + ", topping=" + topping + ", price=" + price + ", pieces="
				+ pieces + "]";
	}	

	abstract public double calPrice(double piecePrice, int pieces);

	public void printDetails() {
		System.out.println("---You Order summary---");
		System.out.println(getName()+" Pizza with "+getTopping()+" topping");
		System.out.println("Number of pieces: "+getPieces()+" at $"+getPrice());
		System.out.printf(getName()+" pizza price is:$"+"%.2f",calPrice(getPrice(),getPieces()));
	}

	protected abstract void make();
	
}
