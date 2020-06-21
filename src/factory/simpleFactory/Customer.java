package factory.simpleFactory;

import factory.abstractFactory.BeijingFactory;
import factory.abstractFactory.LondonFactory;

/**
 * 冒充客户端
 * 
 * @author Van
 */
public class Customer {

	public static void main(String[] args) {
		OrderPizza orderPizza = new OrderPizza();
		// 订购北京产的
		orderPizza.order(new BeijingFactory());
		// 订购伦敦产的
		orderPizza.order(new LondonFactory());
	}

}
