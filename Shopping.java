package com.shoppingcart.learning;

import java.util.ArrayList;
import java.util.ListIterator;

public class Shopping {
	ArrayList<Item> item;
	double totalAmount;

	public Shopping() {
		this.item = new ArrayList<Item>();
		this.totalAmount = 0;
	}

	public void addToCart(Item item) {
		this.item.add(item);
	}

	public void showCart() {
		ListIterator<Item> iterator = item.listIterator();
		while (iterator.hasNext()) {
			Item item1 = iterator.next();
			System.out.println(item1);
		}
	}

	public void removeFromCart(Item i) {
		if(item.contains(i)) {
			item.remove(i);
		}
	}

	public double getTotalAmount() {
		ListIterator<Item> iterator2 = item.listIterator();
		this.totalAmount = 0;
		while (iterator2.hasNext()) {
			Item item3 = iterator2.next();
			this.totalAmount = this.totalAmount + (item3.getPrize()) * item3.getQuantity();
		}
		return this.totalAmount;
	}

	public void printInvoice() {
		ListIterator<Item> iterator3 = item.listIterator();
		while (iterator3.hasNext()) {
			Item item4 = iterator3.next();
			System.out.print(item4.getProductName() + "\t");
			System.out.print(item4.getQuantity() + "\t");
			System.out.print(item4.getPrize() + "\t");
			System.out.println(item4.getPrize() * item4.getQuantity());
		}
		System.out.println("\t\t\t" + "Total    : " + this.getTotalAmount());

	}
}
