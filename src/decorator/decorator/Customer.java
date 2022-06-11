package decorator.decorator;

import org.junit.jupiter.api.Test;

class Customer {
	void checkout(Beverage beverage) {
		System.out.println(beverage.getDescription() + "：￥" + beverage.cost());
	}

	@Test
	void testBagSoyEspresso() {
		// 联想起IO了吧，嵌套构造器，由内而外，从主体到附加
		Beverage beverage = new Bag(1, new Soy(1, new Espresso(2)));
		checkout(beverage);
	}

	@Test
	void testBoxBagMilkSoyDecaf() {
		Beverage beverage = new Box(2, new Bag(1, new Milk(2, new Soy(3, new Decaf(1)))));
		checkout(beverage);
	}
}
