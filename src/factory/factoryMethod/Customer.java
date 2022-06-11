package factory.factoryMethod;

import org.junit.jupiter.api.Test;

class Customer {

	@Test
	void testOrderPizza() {
		PizzaStore pizzaStore = new PepperPizzaStore();
		pizzaStore.orderPizza();
	}

}
