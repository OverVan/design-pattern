package factory.abstractFactory;

/**
 * 具体的创建者类-武汉原料工厂
 * 
 * @author Van
 *
 */
public class WuhanPizzaIngredientFactory extends PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new WuhanDough();
	}

	@Override
	public Saurce createSaurce() {
		return new WuhanSaurce();
	}

}
