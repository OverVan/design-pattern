package factory.abstractFactory;

import org.junit.jupiter.api.Test;

class Customer {

	@Test
	void testOrderPizza() {
		// 武汉风味的奶酪披萨
		PizzaIngredientFactory wuhanPizzaIngredientFactory = new WuhanPizzaIngredientFactory();
		PizzaStore wuhanPizzaStore = new CheesePizzaStore(wuhanPizzaIngredientFactory);
		wuhanPizzaStore.orderPizza();
		// 北京风味的胡椒披萨
		PizzaIngredientFactory beijingPizzaIngredientFactory = new BeijingPizzaIngredientFactory();
		PizzaStore beijingPizzaStore = new PepperPizzaStore(beijingPizzaIngredientFactory);
		beijingPizzaStore.orderPizza();
	}

}
