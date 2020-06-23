package decorator.anotherMine;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 * 
 * @author Van
 */
class ClientTest {

	/**
	 * 一杯美式咖啡，外加一份牛奶、两份巧克力
	 */
	@Test
	void testCoffee() {
		// 连续包装（装饰）
		Drink result = new Milk(2.0f, new Chocolate(3.0f, new LongBlack(10.0f), 1), 2);
		float totalPrice = result.cost();
		System.out.println("总价" + totalPrice);
	}

	/**
	 * 一杯绿茶，外加3份牛奶
	 */
	@Test
	void testGreenTea() {
		// 连续包装
		Drink totalPriceMilk = new Milk(2.0f, new GreenTea(8.0f), 3);
		System.out.println("总价" + totalPriceMilk.cost());
	}

}
