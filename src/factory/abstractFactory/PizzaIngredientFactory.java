package factory.abstractFactory;

/**
 * 抽象的创建者类-原料工厂
 * 
 * @author Van
 *
 */
public abstract class PizzaIngredientFactory {
	/**
	 * 工厂方法
	 * 
	 * @return
	 */
	public abstract Dough createDough();

	/**
	 * 工厂方法
	 * 
	 * @return
	 */
	public abstract Saurce createSaurce();
}
