package com.shoppingcart.learning;

public class Product {
	private String productName;
	private int quantity;
	private double prize;

	public Product(String productName, int quantity, double prize) {
		this.productName = productName;
		this.quantity = quantity;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Item [productName = " + productName + ", quantity = " + quantity + ", prize = " + prize + "]";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

}
