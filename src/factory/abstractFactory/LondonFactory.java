package factory.abstractFactory;

import factory.factoryMethod.LondonCheesePizza;
import factory.factoryMethod.LondonGreekPizza;
import factory.simpleFactory.Pizza;

/**
 * 伦敦工厂类
 * 
 * @author Van
 */
public class LondonFactory implements AbstractFactory {

	@Override
	public Pizza createPizza(String pizzaType) {
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
