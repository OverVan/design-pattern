package decorator.anotherMine;

/**
 * 巧克力类，继承配品类
 * 
 * @author Van
 */
public class Chocolate extends Topping {

	public Chocolate(float price, Drink drink, int count) {
		super(price, drink, count);
		setDescription("巧克力");
	}

}
