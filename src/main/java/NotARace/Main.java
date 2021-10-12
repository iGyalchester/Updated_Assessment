package NotARace;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		CocaCola coke = new CocaCola("Coke", 3);
		CheeseBurger burger = new CheeseBurger("Burger", 6);
		Batteries battery = new Batteries("Duracell", 16);
		Car car = new Car("Honda", 8600);

		Product[] product = new Product[4];
		product[0] = coke;
		product[1] = burger;
		product[2] = battery;
		product[3] = car;


		System.out.println("=================printExpirationDate====================");
		ExpirationDate expirationDate = new ExpirationDate("April", "20", "2022");
		battery.setExpirationDate(expirationDate);

		battery.printExpirationDate(battery);

		System.out.println("================printOrder=====================");
		Product.printOrder(product);

		System.out.println("===============printConsumptionQty======================");
		ArrayList<Consumable>consumables = new ArrayList<>();

		consumables.add(coke);
		consumables.add(burger);
		consumables.add(battery);

		Product.printConsumptionQty(consumables);

		System.out.println("================calculateDiscount=====================");
		System.out.println(burger.calculateDiscount());
		System.out.println(coke.calculateDiscount());
		System.out.println(car.calculateDiscount());

		System.out.println("================isEdible=====================");
		System.out.println(burger.isEdible());

		System.out.println("=================consume====================");
		Drink drink = new CocaCola("Coke", 5);
		System.out.println(drink.consume());

		System.out.println("=================printIngredients====================");
		String[] ingredients = {"Water", "Sugar", "Caffeine"};
		System.out.println(drink.printIngredients(ingredients));
	}
}
