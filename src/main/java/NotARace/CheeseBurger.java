package NotARace;


public class CheeseBurger extends Food{

	public CheeseBurger(String name, double price) {
		super(name, price);
	}



	public double calculateDiscount() {

		return this.getPrice() * DISCOUNT_RATE;
	}

	@Override
	public boolean isEdible() {
		return true;
	}

	@Override
	public int consume() {
		return (int) (Math.random() * 10);
	}
}
