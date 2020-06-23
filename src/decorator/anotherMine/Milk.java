package decorator.anotherMine;

/**
 * 牛奶类，继承配品类
 * 
 * @author Van
 */
public class Milk extends Topping {

	public Milk(float price, Drink drink, int count) {
		super(price, drink, count);
		setDescription("牛奶");
	}

}
