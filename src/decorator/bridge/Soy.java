package decorator.bridge;

/**
 * 具体的附加产品类-豆浆
 */
public class Soy extends Topping {

	public Soy(Beverage beverage, int count) {
		super(beverage, "豆浆", 2, count);
	}

}
