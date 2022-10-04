package factory.simpleFactory;

/**
 * 生产Pizza子类对象的简单工厂
 * 
 * @author Van
 */
public class SimplePizzaFactory {

	// 饿汉式单例
	private static final SimplePizzaFactory SIMPLEPIZZAFACTORY = new SimplePizzaFactory();

	private SimplePizzaFactory() {
	}

	public static SimplePizzaFactory getSimplePizzaFactory() {
		return SIMPLEPIZZAFACTORY;
	}

	/**
	 * 负责对象创建的方法 虽然分离出可变部分，但仍然违反开闭原则，维护性差
	 * 
	 * @param type
	 * @return
	 */
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		// 抽离出的部分仍是可变的：来了新类，还是得修改
		switch (type) {
		case "cheese":
			pizza = new CheesePizza();
			break;
		case "pepper":
			pizza = new PepperPizza();
			break;
		default:
			break;
		}
		return pizza;
	}

}
