package factory.simpleFactory;

public class PizzaStore {
	private SimplePizzaFactory simplePizzaFactory;

	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		super();
		this.simplePizzaFactory = simplePizzaFactory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = simplePizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
