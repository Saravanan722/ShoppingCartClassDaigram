package com.shoppingcart.learning;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product i1 = new Product("Pen", 1, 2.0);
		Product i2 = new Product("Pencil", 5, 10.0);
		Product i3 = new Product("Ink Bottile", 20, 100.0);
		Product i4 = new Product("Papper", 30, 40.0);
		Product i5 = new Product("ExamPad", 1, 50.0);
		Product i6 = new Product("Exam Refer Notes", 5, 500.0);

		ShoppingCart cart = new ShoppingCart();

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
		cart.addToCart(new Product("Gk Book", 5, 300.00));
		cart.printInvoice();
	}
}
