package factory.factoryMethod;

import factory.simpleFactory.Pizza;

public class FactoryMethod {

	/**
	 * 创建北京披萨对象
	 * 
	 * @param pizzaType 品种
	 * @return
	 */
	public Pizza createBeijingPizza(String pizzaType) {
		Pizza pizza = null;
		switch (pizzaType) {
		case "cheese":
			pizza = new BeijingCheesePizza("cheese");
			break;
		case "Greek":
			pizza = new BeijingGreekPizza("Greek");
			break;
		default:
			break;
		}
		System.out.println("北京的Pizza对象出厂");
		return pizza;
	}

	/**
	 * 创建伦敦披萨对象
	 * 
	 * @param pizzaType 品种
	 * @return
	 */
	public Pizza createLondonPizza(String pizzaType) {
		Pizza pizza = null;
		switch (pizzaType) {
		case "cheese":
			pizza = new LondonCheesePizza("cheese");
			break;
		case "Greek":
			pizza = new LondonGreekPizza("Greek");
			break;
		default:
			break;
		}
		System.out.println("伦敦的Pizza对象出厂");
		return pizza;
	}

}
