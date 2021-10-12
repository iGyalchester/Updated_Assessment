package NotARace;

public abstract class Food extends Product implements Consumable, Edible{
	public final double DISCOUNT_RATE = .20;

	public Food(String name, double price) {
		super(name, price);
	}


	@Override
	public double calculateDiscount() {
		return this.getPrice() * DISCOUNT_RATE;
	}


}
