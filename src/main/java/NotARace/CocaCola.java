package NotARace;

public class CocaCola extends Drink{

	public CocaCola(String name, double price) {
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
