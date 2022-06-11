package factory.factoryMethod;

/**
 * 具体的创建者类
 * 
 * @author Van
 *
 */
public class PepperPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza() {
		return new PepperPizza();
	}

}
