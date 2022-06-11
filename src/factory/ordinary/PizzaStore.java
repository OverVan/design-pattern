package factory.ordinary;

public class PizzaStore {
	public String getPizzaType(String type) {
		return type;
	}

	/**
	 * 对象的创建和使用耦合，可变代码与不可变代码耦合
	 * 
	 * @param type
	 * @return
	 */
	public Pizza orderPizza(String type) {
		/* 变化部分开始 */
		Pizza pizza = null;
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
		/* 变化部分结束 */

		// 不变的部分
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
