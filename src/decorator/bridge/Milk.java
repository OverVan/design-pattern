package decorator.bridge;

/**
 * 具体的附加产品类-牛奶
 */
public class Milk extends Topping {

	public Milk(Beverage beverage, int count) {
		super(beverage, "牛奶", 3, count);
	}

}
