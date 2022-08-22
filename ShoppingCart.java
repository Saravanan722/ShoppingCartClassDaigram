package com.shoppingcart.learning;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
	ArrayList<Product> item;
	double totalAmount;

	public ShoppingCart() {
		this.item = new ArrayList<Product>();
		this.totalAmount = 0;
	}

	public void addToCart(Product item) {
		this.item.add(item);
	}

	public void showCart() {
		ListIterator<Product> iterator = item.listIterator();
		while (iterator.hasNext()) {
			Product item1 = iterator.next();
			System.out.println(item1);
		}
	}

	public void removeFromCart(Product i) {
		if (item.contains(i)) {
			item.remove(i);
		}
	}

	public double getTotalAmount() {
		ListIterator<Product> iterator2 = item.listIterator();
		this.totalAmount = 0;
		while (iterator2.hasNext()) {
			Product item3 = iterator2.next();
			this.totalAmount = this.totalAmount + (item3.getPrize()) * item3.getQuantity();
		}
		return this.totalAmount;
	}

	public void printInvoice() {
		ListIterator<Product> iterator3 = item.listIterator();
		while (iterator3.hasNext()) {
			Product item4 = iterator3.next();
			System.out.print(item4.getProductName() + "\t");
			System.out.print(item4.getQuantity() + "\t");
			System.out.print(item4.getPrize() + "\t");
			System.out.println(item4.getPrize() * item4.getQuantity());
		}
		System.out.println("\t\t\t" + "Total    : " + this.getTotalAmount());

	}
}
