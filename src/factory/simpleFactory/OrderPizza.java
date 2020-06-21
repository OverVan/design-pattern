package factory.simpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.abstractFactory.AbstractFactory;
import factory.factoryMethod.FactoryMethod;

/**
 * 披萨订购类
 * 
 * @author Van
 */
public class OrderPizza {

	/**
	 * 输入所订购披萨的名字并返回
	 * 
	 * @return
	 */
	public String getPizzaType() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input the type of pizza: ");
		String pizzaType = "";
		try {
			pizzaType = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pizzaType;
	}

	/**
	 * 根据厂址订购披萨
	 * 
	 * @param factoryMethod 生产地址，向上转型
	 */
	public void order(AbstractFactory abstractFactory) {
		Pizza pizza = abstractFactory.createPizza(getPizzaType());
		pizza.prepare();
		// 后续三道工序同流
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	private FactoryMethod factoryMethod = new FactoryMethod();

	/**
	 * 订购北京产的披萨
	 */
	public void orderBeijing() {
		Pizza pizza = factoryMethod.createBeijingPizza(getPizzaType());
		pizza.prepare();
		// 后续三道工序同流
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	/**
	 * 订购伦敦产的披萨
	 */
	public void orderLodon() {
		Pizza pizza = factoryMethod.createLondonPizza(getPizzaType());
		pizza.prepare();
		// 后续三道工序同流
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

}
