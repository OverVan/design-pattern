package template;

import org.junit.jupiter.api.Test;

class Customer {

	@Test
	void testCoffee() {
		CoffeineBeverage coffee = new Coffee();
		coffee.prepareRecipeWithHook();
	}

	@Test
	void testTea() {
		CoffeineBeverage tea = new Tea();
		tea.prepareRecipeWithHook();
	}

}
