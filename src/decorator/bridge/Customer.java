package decorator.bridge;

import org.junit.jupiter.api.Test;

class Customer {
	@Test
	void testBagSoyDecaf() {
		// 各种产品下的单品只能买一种，如买了豆浆就不能叠加买牛奶
		Wrapper bag = new Bag(new Soy(new Decaf(1), 2), 1);
		System.out.println(bag.getDescription() + "：\uffe5" + bag.cost());
	}

	@Test
	void testMilkEspresso() {
		Milk milk = new Milk(new Espresso(2), 2);
		System.out.println(milk.getDescription() + "：\uffe5" + milk.cost());
	}
}
