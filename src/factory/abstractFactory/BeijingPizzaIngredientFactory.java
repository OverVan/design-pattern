package factory.abstractFactory;

/**
 * 具体的创建者类-北京原料工厂
 * 
 * @author Van
 *
 */
public class BeijingPizzaIngredientFactory extends PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new BeijingDough();
	}

	@Override
	public Saurce createSaurce() {
		return new BeijingSaurce();
	}

}
