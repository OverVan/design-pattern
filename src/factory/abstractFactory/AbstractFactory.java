package factory.abstractFactory;

import factory.simpleFactory.Pizza;

/**
 * 抽象工厂
 * 
 * @author Van
 */
public interface AbstractFactory {

	Pizza createPizza(String pizzaType);

}
