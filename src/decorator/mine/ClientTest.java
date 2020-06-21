package decorator.mine;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ClientTest {

	public static void order(Coffee coffee) {
		System.out.println("单品：" + coffee.getName() + "；" + "数量：" + coffee.getCount());
		System.out.println("配品：");
		for (Topping topping : coffee.getToppings())
			System.out.println("\t品名：" + topping.getName() + "；数量：" + topping.getCount());
		System.out.println("总价：" + coffee.getTotalPrice() + "\n");
	}

	/**
	 * 两杯拿铁咖啡，各加一份巧克力
	 */
	@Test
	void testOne() {
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(new Topping("巧克力", 2.0f, 1));
		Coffee coffee = new Coffee("拿铁", 8.0f, toppings, 2);
		order(coffee);
	}

	/**
	 * 三倍英氏咖啡，什么也不加
	 */
	@Test
	void testTwo() {
		List<Topping> toppings = new ArrayList<Topping>();
		order(new Coffee("英氏咖啡", 6.0f, toppings, 3));
	}

	/**
	 * 一杯英氏咖啡，加两份牛奶，一份巧克力
	 */
	@Test
	void testThree() {
		List<Topping> toppings = new ArrayList<Topping>();
		toppings.add(new Milk(2));
		toppings.add(new Chocolate(1));
		order(new Coffee("英氏咖啡", 6.0f, toppings, 1));
	}

}
