package NotARace;

public abstract class Drink extends Product implements Consumable{
	public final double DISCOUNT_RATE = .30;

	public Drink(String name, double price) {
		super(name, price);
	}

}
