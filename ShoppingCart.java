package com.shoppingcart.learning;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1 = new Item("Pen", 1, 2.0);
		Item i2 = new Item("Pencil", 5, 10.0);
		Item i3 = new Item("Ink Bottile", 20, 100.0);
		Item i4 = new Item("Papper", 30, 40.0);
		Item i5 = new Item("ExamPad", 1, 50.0);
		Item i6 = new Item("Exam Refer Notes", 5, 500.0);

		Shopping cart = new Shopping();

		cart.addToCart(i1);
		cart.addToCart(i2);
		cart.addToCart(i3);
		cart.addToCart(i4);
		cart.addToCart(i5);

		cart.showCart();

		cart.removeFromCart(i3);

		cart.showCart();

		double totalAmount = cart.getTotalAmount();
		System.out.println(totalAmount);
		cart.printInvoice();
		cart.addToCart(new Item("Gk Book", 5, 300.00));
		cart.printInvoice();
		cart.getTotalAmount();
		cart.printInvoice();
		

	}
}
