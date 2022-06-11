package factory.abstractFactory;

/**
 * 具体的创建者类
 * 
 * @author Van
 *
 */
public class CheesePizzaStore extends PizzaStore {
	/**
	 * 子类指定具体的原料工厂
	 * 
	 * @param pizzaIngredientFactory
	 */
	public CheesePizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
	}

	@Override
	public Pizza createPizza() {
		return new CheesePizza(getPizzaIngredientFactory());
	}
}
