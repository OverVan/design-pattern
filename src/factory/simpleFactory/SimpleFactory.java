package factory.simpleFactory;

/**
 * 生产Pizza对象的简单工厂
 * 
 * @author Van
 */
public class SimpleFactory {

	// 单例模式
	private static final SimpleFactory SIMPLEFACTORY = new SimpleFactory();

	private SimpleFactory() {

	}

	public static SimpleFactory getSimpleFactory() {
		return SIMPLEFACTORY;
	}

	/**
	 * 根据传入的披萨类型实例化相应的披萨对象
	 * 
	 * @param pizzaType 披萨类型
	 * @return
	 */
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		switch (pizzaType) {
		case "cheese":
			pizza = new CheesePizza("cheese");
			break;
		case "Greek":
			pizza = new GreekPizza("Greek");
			break;
		default:
			break;
		}
		System.out.println("Pizza对象出厂");
		return pizza;
	}

}
