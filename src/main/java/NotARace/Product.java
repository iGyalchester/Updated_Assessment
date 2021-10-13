package NotARace;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Product{
	private String name;
	private double price;
	public final double DISCOUNT_RATE = .10;
	protected ExpirationDate expirationDate;

	public Product(String name, double price){
		this.name = name;
		this.price = price;
	}

	public void setExpirationDate(ExpirationDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ExpirationDate getExpirationDate() {
		return this.expirationDate;
	}

	public abstract double calculateDiscount();

	public void printExpirationDate(Product product) {
		System.out.println(product.getName()+ " expires on: " + product.getExpirationDate());
	}

	public static void printOrder(Product[] product){
		double sum = 0;
		for (Product p : product) {
			System.out.println(p);
		}
		for (Product p : product) {
			sum += p.getPrice();
		}
		System.out.println("Total will cost you, " + sum);
	}

	public static void printConsumptionQty(ArrayList<Consumable> consumables){
		for (Consumable c : consumables) {
			System.out.println(c.consume());
		}
	}

	public String printIngredients(String[] ingredients){
		return Arrays.toString(ingredients);
	}

	@Override
	public String toString() {
		return name + " will cost you, " + price;
	}


}
