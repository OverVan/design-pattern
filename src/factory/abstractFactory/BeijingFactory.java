package factory.abstractFactory;

import factory.factoryMethod.BeijingCheesePizza;
import factory.factoryMethod.BeijingGreekPizza;
import factory.simpleFactory.Pizza;

/**
 * 北京工厂类
 * 
 * @author Van
 */
public class BeijingFactory implements AbstractFactory {

	@Override
	public Pizza createPizza(String pizzaType) {
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

}
