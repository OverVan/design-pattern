package factory.abstractFactory;

import factory.simpleFactory.OrderPizza;

public class Customer {

	public static void main(String[] args) {
		OrderPizza orderPizza = new OrderPizza();
		// 订购北京产的
		orderPizza.orderBeijing();
		// 订购伦敦产的
		orderPizza.orderLodon();
	}

}
