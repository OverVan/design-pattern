package factory.factoryMethod;

/**
 * 抽象的创建者类Creator
 * 
 * @author Van
 *
 */
public abstract class PizzaStore {
	public Pizza orderPizza() {
		Pizza pizza = createPizza();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	/**
	 * 这就是工厂方法，由子类决定实例化哪个类
	 * 
	 * @return
	 */
	public abstract Pizza createPizza();
}
