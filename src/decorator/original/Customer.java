package decorator.original;

import org.junit.jupiter.api.Test;

class Customer {
	void checkout(Beverage beverage) {
		System.out.println(beverage.getDescription() + "：￥" + beverage.cost());
	}

	@Test
	void testSoyEspresso() {
		Espresso espresso = new Espresso(2, null, new Soy(1));
		checkout(espresso);
	}

	@Test
	void testMilkSoyDecaf() {
		Decaf decaf = new Decaf(1, new Milk(2), new Soy(3));
		checkout(decaf);
	}
}
