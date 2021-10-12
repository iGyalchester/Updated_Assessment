import NotARace.CheeseBurger;
import org.junit.Assert;
import org.junit.Test;

public class Testcase {

	@Test
	public void calculateDiscountTest(){
		CheeseBurger burger = new CheeseBurger("Double Cheeseburger", 14);
		double discountRate = .20;
		double expectedDiscounted = burger.getPrice() * discountRate;

		double actualDiscount = burger.calculateDiscount();

		Assert.assertEquals(expectedDiscounted, actualDiscount, 1);
	}
}
