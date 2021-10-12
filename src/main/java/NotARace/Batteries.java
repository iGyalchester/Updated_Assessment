package NotARace;

public class Batteries extends Product implements Consumable{

	public Batteries(String name, double price) {
		super(name, price);
	}


	@Override
	public double calculateDiscount() {
		return this.getPrice() * DISCOUNT_RATE;
	}

	@Override
	public int consume() {
		return (int) (Math.random() * 10);
	}
}
