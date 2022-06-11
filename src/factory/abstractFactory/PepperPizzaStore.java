package factory.abstractFactory;

/**
 * 具体的创建者类
 * 
 * @author Van
 *
 */
public class PepperPizzaStore extends PizzaStore {

	public PepperPizzaStore(PizzaIngredientFactory pizzaIngredientFactory) {
		super(pizzaIngredientFactory);
	}

	@Override
	public Pizza createPizza() {
		return new PepperPizza(getPizzaIngredientFactory());
	}

}
