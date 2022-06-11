package factory.abstractFactory;

/**
 * 抽象的创建者类Creator
 * 
 * @author Van
 *
 */
public abstract class PizzaStore {
	// 聚合原料工厂
	private PizzaIngredientFactory pizzaIngredientFactory;

	public PizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	public PizzaIngredientFactory getPizzaIngredientFactory() {
		return pizzaIngredientFactory;
	}

	public Pizza orderPizza() {
		Pizza pizza = createPizza();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	public abstract Pizza createPizza();
}
